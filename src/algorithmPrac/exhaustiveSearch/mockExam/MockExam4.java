package algorithmPrac.exhaustiveSearch.mockExam;

import java.util.stream.IntStream;

/***
 * @모의고사_level1 (p.192)
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 *
 * @주의: 완전 탐색에서는 방문 처리를 해 주는것에 유의한다.
 */

public class MockExam4 {

    private static final int[][] RULES = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    private int getPick(int student, int problem) {
        int[] answerSet = RULES[student];
        int index = problem % answerSet.length;
        return answerSet[index];
    }

    public int[] solution(int[] answers) {
        int[] picks = new int[3];
        int max = 0;

        for (int problem = 0; problem < answers.length; problem ++) {
            int answer = answers[problem];

            for (int student = 0; student < 3; student ++) {
                int score = getPick(student, problem);

                if (answer == score) {
                    if (++picks[student] > max) {
                        max = picks[student];
                    }
                }
            }
        }

        final int maxCorrects= max;
        return IntStream.range(0, 3)
                .filter(i -> picks[i] == maxCorrects)
                .map(i -> i + 1)
                .toArray();
    }
}



