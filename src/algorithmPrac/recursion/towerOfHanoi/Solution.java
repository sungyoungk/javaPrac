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


        private List<int[]> hanoi(int n, int from, int to) {
            int empty = 6 - from - to;
            List<int[]> list = new ArrayList<>();
            if (n == 1) return List.of(new int[] {from, to});

            list.addAll(hanoi(n-1, from, empty));
            list.addAll(hanoi(1, from, to));
            list.addAll(hanoi(n-1, empty, to));
            return list;
        }

        public int[][] solution(int n) {

            return hanoi(n,1, 3).toArray(new int[0][]);
        }
    }
}
