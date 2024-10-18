package algorithmPrac.array.matrix;

public class Solution {

    int[][] arr1 = {{1,4}
                   ,{3,2}
                   ,{4,1}};

    int[][] arr2 = {{3,3}
                    ,{3,3}};


    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] arr = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
                for (int k = 0; k < arr[i].length; k++) {
                    arr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] arr1 = {{1,4}
                ,{3,2}
                ,{4,1}};

        int[][] arr2 = {{3,3}
                ,{3,3}};

        int[][] answer = sol.solution(arr1, arr2);

        // 결과 출력
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }


    }
}
