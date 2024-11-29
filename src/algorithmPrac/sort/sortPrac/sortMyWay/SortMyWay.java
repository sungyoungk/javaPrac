package algorithmPrac.sort.sortPrac.sortMyWay;

import java.util.Arrays;

/**
 * @문자열_내_마음대로_정렬하기 level1 p.253
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/12915
 */
public class SortMyWay {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (s1, s2) -> {
            if(s1.charAt(n) != s2.charAt(n)) {
                return s1.charAt(n) - s2.charAt(n);
            } else {
                return s1.compareTo(s2);
            }
        });
        return strings;
    }
}
