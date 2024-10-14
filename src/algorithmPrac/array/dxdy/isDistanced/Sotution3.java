package algorithmPrac.array.dxdy.isDistanced;

import algorithmPrac.array.dxdy.Solution3;

import javax.swing.*;

public class Sotution3 {
    String[][] places = {
            {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
            {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
            {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
            {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "00000"},
            {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
    };
    //
                                  // 상  좌  우  하
                                  // 0   1   2  3
    private static final int[] dx = {0, -1, 1, 0};
    private static final int[] dy = {-1, 0, 0, 1};
 /*
     P : 응시자가 앉아있는 자리
     O : 빈 테이블
     X : 파티션
     */

    private boolean isNextToVolunteer(char[][] room, int x, int y, int exclude) {
        for (int d = 0; d < 4; d++) {
            if(d == exclude) continue;

            int nx = x + dx[d];
            int ny = y + dy[d];
            if(ny < 0 || ny >= room.length || nx < 0 || nx >= room.length) continue;
            if(room[ny][nx] == 'P') return true;
        }
        return false;
    }


    private boolean isDistanced(char[][] room, int x, int y) {
        for (int d = 0; d < 4; d++) {
            int ny = y + dy[d];
            int nx = x + dx[d];

            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room.length) continue;

            switch(room[ny][nx]) {
                case 'P': return false;
                case 'O': if(isNextToVolunteer(room, nx, ny, 3-d)) return false;
                break;
            }
        }
        return true;
    }

    private boolean isDistanced(char[][] room) {

        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                if(room[y][x] != 'P') continue;
                if(!isDistanced(room, x, y)) return false;
            }
        }
        return true;
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < places.length; i++) {
            String[] place = places[i];
            char[][] room = new char[place.length][];
            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }
            if (isDistanced(room)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();

        String[][] places = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "00000"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };


        Sotution3 sol3 = new Sotution3();

        int[] array = sol3.solution(places);
        for (int answer : array) {
            System.out.println(answer);
        }


    }
}
