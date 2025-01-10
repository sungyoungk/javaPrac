package algorithmPrac.array.matrix;

public class Solution3 {


    //(곱셈) = {{50,68},{122,167}}
    int[][]arr1 = {{1,2,3},
                   {4,5,6}};

    int[][]arr2 = {{7,10},
                   {8,11},
                   {9,12}};

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] arr = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2[0].length; j++) {
                arr[i][j] = 0;
            for(int k = 0; k < arr[i].length; k++) {
                arr[i][j] += arr[i][k] * arr[k][i];
            }
            }
        }
        return arr;
    }
}
