package algorithmPrac.recursion.towerOfHanoi;

import java.util.ArrayList;
import java.util.List;

/**
 * @하노이의_탑 level 3 p.172
 * @URL https://school.programmers.co.kr/learn/courses/30/lessons/12946
 */
public class Hanoi {


    private List<int[]> hanoi(int n, int from, int to) {
        // 종료 조건, 점화식 구현
        if (n == 1) {
            return List.of(new int[]{from, to});
        }

        // 조건)
        int empty = 6 - from - to;

        List<int[]> result = new ArrayList<>();

        result.addAll(hanoi(n-1, from, empty));
        result.addAll(hanoi(1,from,to));
        result.addAll(hanoi(n-1, empty, to));
        return result;
    }

    public int[][] solution(int n){
        return hanoi(n,1,3).toArray(new int[0][]);
    }
}
