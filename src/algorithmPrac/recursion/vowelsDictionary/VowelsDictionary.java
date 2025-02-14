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

    private static final char[] CHARS = "AEIOU".toCharArray();

    private List<String> generate(String word) {
        List<String> words = new ArrayList<>();
        words.add(word);

        if (word.length() == 5) return words;

        for(char c : CHARS) {
            words.addAll(generate(word + c));
        }
        return words;
    }


    public int solution(String word) {
        return generate("").indexOf(word);
    }
}
