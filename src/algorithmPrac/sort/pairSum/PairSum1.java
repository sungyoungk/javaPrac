package algorithmPrac.sort.pairSum;

import java.util.HashSet;
import java.util.Set;

/**
 * @두_개_뽑아서_더하기 level1 p. 240
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/68644
 * <p>
 * <p>
 * 정수 배열 numbers가 주어집니다.
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들
 * 수 있는 모든 수를 배열에 오름차순으로 담아 return하도록
 * solution 함수를 완성해주세요.
 * <p>
 * [입출력 예시]
 * |_______________________________
 * numbers    |  result
 * |-------------------------------
 * [2,1,3,4,1]  |  [2,3,4,5,6,7]
 * |-------------------------------
 */
public class PairSum1 {

    public int[] solution(int[] numbers) {

    Set<Integer> set = new HashSet<>();

    for ( int i = 0; i < numbers.length; i ++ ) {
        for ( int j = i + 1; j < numbers.length; j++ ) {
            set.add(numbers[i] + numbers[j]);
        }
    }

        return set.stream().mapToInt(s -> s.intValue()).sorted().toArray();
    }


}
