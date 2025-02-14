package algorithmPrac.recursion.towerOfHanoi;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @하노이의_탑(최적화) level 3 p.172
     * @URL https://school.programmers.co.kr/learn/courses/30/lessons/12946
     */
    public class Hanoi3 {


        /***
         @상태 (n, from, to) 원판 n개를 from에서 to로 옮기는 과정
         @종료조건 (n - 1, from, to) 가장 작은 조건은 (1, from, to) 원판 1개를 옮길때
         {n-1, from, to}
         {1, from, to}
         {n-1, from, empty}
         */

        private void hanoi(int n, int from, int to , List<int[]>process) {
            if (n == 1) {
                process.add(new int[]{from, to});
                return;
            }

            int empty = 6 - from - to;

            hanoi(n-1, from, empty, process);
            hanoi(1, from, to, process);
            hanoi(n-1, empty, to, process);
        }

        public int[][] solution(int n) {
            List<int[]> process = new ArrayList<>();
            hanoi(n, 1, 3, process);

            return process.toArray(new int[0][]);
        }
    }
}
