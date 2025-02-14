package algorithmPrac.recursion.vowelsDictionary;

import java.util.ArrayList;
import java.util.List;

/***
 * @모음_사전 (Level 2) p.180
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/84512
 */

public class VowelsDictionary {

    /**
     * @상태 (string, word, n)
     * (string, words, n+1) 단, 0 < n < 6
     */

    private static final char[] arr = "AEIOU".toCharArray();

    private List<String> generate(String word) {
        List<String> result = new ArrayList<>();
        result.add(word);

        if (word.length() == 5) return result;

        for (char c : arr) {
            result.addAll(generate(word +c));
        }
        return result;
    }




    public int solution(String word) {
        return generate("").indexOf(word);
    }
}
