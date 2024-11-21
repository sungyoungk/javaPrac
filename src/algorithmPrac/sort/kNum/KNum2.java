package algorithmPrac.sort.kNum;

import java.util.Arrays;

/**
 * @K_번째_수 level 1 p.237
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/42748
 */
public class KNum2 {


    /***
     *   int i = 1
     *   int j = 4
     *   int k =3
     *
     *   i~j 까지 범위 sort 해서 k번째 숫자
     *   [1,2,3,4,5] 1~3 까지면 0 ~ 2
         답 = 3
     */

  public int[] solution(int[] array, int[][] commands) {

    int[] answer = new int[commands.length];

    for (int i = 0; i < answer.length; i ++) {
        int[] command = commands[i];

        int from = command[0] - 1 ;
        int to   = command[1]     ;
        int k    = command[0] - 1 ;

        int[] sub = Arrays.copyOfRange(array, from, to);

        answer[i] = sub[i];

    }

    return answer;
    }

}
