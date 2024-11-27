package algorithmPrac.sort.hIndex;

/**
 * @H-Index level 2 p.243
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/42747
 */

import javax.swing.text.AsyncBoxView;
import java.util.Arrays;

/**@문제
 *    어떤 과학자가 발표한 논문 n편 중,
 *    h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-lndex 이다.
 *    어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때,
 *    이 과학자의 H-lndex 를 return 하도록 solution 함수를 작성해주세요.
 *
 * @입출력_예시
 * [3, 0, 6, 1, 5 ]  ->  논문 5편 중,  3 편의 논문은 3회 이상 인용, 나머지 2편의 논문은 3회 이하 인용, h 인덱스는 *3*
 */

public class HIndex {


    private boolean isValid(int[] citations, int h) {
        int index = citations.length - h;
        return citations[index] >= h;
    }

    public int solution(int[] citations) {
        Arrays.sort(citations);
for (int h = citations.length; h >=1; h--) {
    if ( isValid(citations, h)) return h;
    // h의 범위는 0을 포함하지만, 0은 가장 작은 값이기 때문에, 검사 없이 바로 반환
}
return 0;
    }
}