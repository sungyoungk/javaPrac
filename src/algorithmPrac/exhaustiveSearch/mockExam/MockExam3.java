package algorithmPrac.exhaustiveSearch.mockExam;

import java.util.stream.IntStream;

/***
 * @모의고사_level1 (p.192)
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 *
 * @주의: 완전 탐색에서는 방문 처리를 해 주는것에 유의한다.
 */

public class MockExam3 {

    private static final int[][] RULES = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };


    private int getPicked(int student, int i) {
        int index = i % RULES[student].length;
        return RULES[student][index];
    }

    public int[] solution(int[] answers) {
        int[] corrects = new int[3];
        int max = 0;

        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];

            for (int student = 0; student < RULES.length; student++) {
                int picked = getPicked(student, i);

                if (answer == picked) {
                    if (++corrects[student] > max)
                        max = corrects[student];
                }
            }
        }
        final int maxCorrects = max;
        return IntStream.range(0, 3).filter(i -> corrects[i] == maxCorrects)
                .map(i -> i + 1).toArray();
    }
}
