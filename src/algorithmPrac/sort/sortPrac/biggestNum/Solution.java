package algorithmPrac.sort.sortPrac.biggestNum;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @가장_큰_수 level2 p.257
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/42746
 */
public class Solution {
    public String solution(int[] numbers) {
      return Arrays.stream(numbers)
              .mapToObj(String::valueOf)
              .sorted( (s1, s2) -> {
                int orig     = Integer.parseInt(s1 + s2);
                int reversed = Integer.parseInt(s2 + s1);
                return reversed - orig;
              })
              .collect(Collectors.joining(""))
              .replaceAll("^0+", "0");
    }
}
