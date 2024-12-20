package algorithmPrac.array.triagleSnail;

import java.util.Arrays;

public class Sol3 {


    private int[] solution(int n) {
       int[][] triangle = new int[n][n];
       int x = 0;
       int y = 0;
       int v = 1;

      while(true) {
          while(true){
              triangle[y][x] = v++;
              if(y+1 == n || triangle[y+1][x] != 0) break;
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
          y--;
          x--;

          while(true) {
              triangle[y][x] = v++;
              if(triangle[y-1][x-1] != 0) break;
              y--;
              x--;
          }
          if(triangle[y+1][x] != 0) break;
          y++;
      }

      int[] result = new int[v-1];
      int index = 0;
      for(int i = 0; i < n; i++) {
          for(int j = 0; j <= i; j++) {
              result[index++] = triangle[i][j];
          }
      }
      return result;
    }

    public static void main(String[] args) {
        Sol3 sol3 = new Sol3();
        int[] solution = sol3.solution(5);

        System.out.println(Arrays.toString(solution));
    }
}
