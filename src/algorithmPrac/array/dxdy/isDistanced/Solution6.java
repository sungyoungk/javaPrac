package algorithmPrac.array.dxdy.isDistanced;

public class Solution6 {
    String[][] places = {
            {"POOOP",
                    "OXXOX",
                    "OPXPX",
                    "OOXOX",
                    "POXXP"},

            {"POOPX",
                    "OXPXP",
                    "PXXXO",
                    "OXXXO",
                    "OOOPP"},

            {"PXOPX",
                    "OXOXP",
                    "OXPOX",
                    "OXXOP",
                    "PXPOX"},

            {"OOOXX",
                    "XOOOX",
                    "OOOXX",
                    "OXOOX",
                    "00000"},

            {"PXPXP",
                    "XPXPX",
                    "PXPXP",
                    "XPXPX",
                    "PXPXP"} };
            /*
             P : 응시자가 앉아있는 자리
             O : 빈 테이블
             X : 파티션
             */

                           //  상  좌  우 하
                           //  0   1  2  3
    private static int[] dx = {0, -1, 1, 0};
    private static int[] dy = {-1, 0, 0, 1};

    private boolean isNextDoor(char[][] room, int x, int y, int exclude) {

        for (int d = 0; d < 4; d++) {

            if(d == exclude) continue;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if(ny < 0 || ny >= room.length || nx < 0 || nx >= room.length) continue;

            if(room[ny][nx] == 'P') return true;
        }
        return false;
    }

    private boolean isDistance(char[][] room, int x, int y) {
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(ny < 0 || ny >= room.length || nx < 0 || nx >= room.length) continue;

            switch(room[ny][nx]) {
                case 'P' : return false;
                case 'O' : if(isNextDoor(room, nx, ny, 3-d)) return false;
                break;
            }
        }
        return true;
    }

    private boolean isDistance(char[][] room) {

        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                if(room[i][j] != 'P') continue;
                if (!isDistance(room, j, i)) return false;
            }
        }
        return true;
    }


    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < answer.length; i++) {
            String[] place = places[i];
            char[][] room = new char[place.length][];
            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }
            if (isDistance(room)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution6 sol2 = new Solution6();

        String[][] places = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "00000"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };

        int[] answers = sol2.solution(places);

        for (int answer : answers) {
            System.out.println(answer);
        }
    }

}
