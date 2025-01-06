package algorithmPrac.array.dxdy.isDistanced;

/**
 * 프로그래머스_거리두기 확인하기(Lv2)
 *
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/81302
 * p.86
 */
public class Solution6 {
    //  상  좌  우 하
    //  0   1  2  3
    private final int[] dx = {0, -1, 1, 0};
    private final int[] dy = {-1, 0, 0, 1};

    private boolean isNext(char[][] room, int x, int y, int exclude) {
        for(int d = 0; d < 4; d++) {
            if (d == exclude) continue;
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length) continue;
            if(room[ny][nx] == 'P') return true;
        }
        return false;
    }

    private boolean distanced(char[][] room, int x, int y) {
        for(int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length) continue;
           switch(room[ny][nx]) {
               case 'P' : return false;
               case 'O' : if(isNext(room, nx, ny, 3 - d)) return false;
               break;
           }
        }
        return true;
    }

    private boolean distanced(char[][] room) {
        for(int y = 0; y < room.length; y++) {
            for( int x = 0; x < room[y].length; x++) {
                if(room[y][x] != 'P') continue;
                if(! distanced(room, x, y)) return false;
            }
        }
        return true;
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for(int i = 0; i < answer.length; i++) {
            String[] place = places[i];
            char[][] room = new char[place.length][];

            for(int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }
            if(distanced(room)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
}
