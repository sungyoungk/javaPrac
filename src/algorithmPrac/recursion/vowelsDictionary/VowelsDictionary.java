package algorithmPrac.recursion.vowelsDictionary;

import java.util.ArrayList;
import java.util.List;

/***
 * @모음_사전 (Level 2) p.180
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/84512
 */

public class VowelsDictionary {

    char[] words = {'A', 'E', 'I', 'O', 'U'};

    /**
     * @상태 (string, word, n)
     * (string, words, n+1) 단, 0 < n < 6
     */

    char[] chars = "AEIOU".toCharArray();

    public void generate(String word, List<String> words) {
        words.add(word);

        if(word.length() == 5) {
            return;
        }


        for (char c : chars) {
            generate(word + c, words);
        }
    }


    public int solution(String word) {
        List<String> words = new ArrayList<>();

        generate("", words);

        return words.indexOf(word);
    }
}
