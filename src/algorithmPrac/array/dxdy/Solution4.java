package algorithmPrac.array.dxdy;

import java.util.Arrays;

public class Solution4 {
    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};


    private int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int v = 1;
        int d = 0;
        int x = 0;
        int y = 0;

        while (true) {
            triangle[y][x] = v++;

            int nx = x + dx[d];
            int ny = y + dy[d];
            if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) {
                d = (d + 1) % 3;

                nx = x + dx[d];
                ny = y + dy[d];
                if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) break;
            }
            x = nx;
            y = ny;
        }
        int[] result = new int[v-1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[index++] = triangle[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        int[] answer = solution.solution(6);

        System.out.println(Arrays.toString(answer));

    }

}
