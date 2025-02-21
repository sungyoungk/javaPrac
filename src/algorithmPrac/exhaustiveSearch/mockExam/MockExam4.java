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
    
    private int picked(int student, int problem) {
        int[] studentNo = RULES[student];
        int index = problem % studentNo.length;
        return studentNo[index];
    }

    public int[] solution(int[] answers) {

        int[] correct = new int[3];
        int max = 0;

        for (int problem = 0; problem < answers.length; problem++) {
            for ( int student = 0; student < 3; student++) {
                int answer = answers[problem];
                int getPicked = picked(student, problem);

                if ( answer == getPicked) {
                    if (++correct[student] > max) {
                        max = correct[student];
                    }
                }
            }
        }

        final int maxNum = max;
        return IntStream.range(0,3)
                .filter(i -> correct[i] == maxNum)
                .map(i -> i + 1)
                .toArray();
    }
}



