package algorithmPrac.exhaustiveSearch;

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


   private int getAnswer(int answerNum, int studentNum) {
       int index = answerNum % RULES.length;
       return RULES[studentNum][index];
   }

    public int[] solution(int[] answers) {
       int[] corrects = new int[3];
       int max = 0;

       for(int i = 0; i < answers.length; i ++) {
           int answer = answers[i];
           for( int j = 0; j < RULES.length; j ++) {
               int studentAnswer = getAnswer(i, j);

               if(answer == studentAnswer) {
                   if (++corrects[j] > max) {
                       max = corrects[i];
                   }
               }
           }
       }

       final int correctMax = max;
       return IntStream.range(0,2).filter(i -> corrects[i] == correctMax)
               .map(i -> i+1).toArray();
    }
}
