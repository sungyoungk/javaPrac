package algorithmPrac.array.triagleSnail;

import java.util.Arrays;

public class Sol2 {

    public int[] solution(int n) {
        int x = 0;
        int y = 0;
        int v = 1;

        int[][] triangle = new int[n][n];

        while (true) {

            while (true){
                triangle[y][x] = v++;
                if (y + 1 == n || triangle[y + 1][x] != 0) break;
                y++;
            }
            if(x+1 == n || triangle[y][x+1] != 0) break;
            x++;

            while(true) {
                triangle[y][x] = v++;
                if(x+1 == n || triangle[y][x+1] != 0) break;
                x++;
            }
            if(triangle[y-1][x-1] != 0) break;
            x--;
            y--;

            while(true) {
            triangle[y][x] = v++;
            if(triangle[y-1][x-1] != 0) break;
            y--;
            x--;
            }
            if(y+1 == n || triangle[y+1][x] !=0) break;
            y++;
        }
        int[] result = new int[v -1];
        int index = 0;
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j <= i; j++) {
                result[index++] = triangle[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Sol2 solution = new Sol2();
        System.out.println(Arrays.toString(solution.solution(6)));

    }


}
