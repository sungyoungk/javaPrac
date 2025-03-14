package algorithmPrac.stringMethod.substring;

import java.util.ArrayList;
import java.util.List;

public class Compress {
/**
 * @문자열_압출_level2 p.120
 * @URL: https://programmers.co.kr/learn/courses/30/lessons/60057
 */
    //
    String str = "aabbaccc";


    //

    private List<String> split(String source, int length) {
     List<String> tokens = new ArrayList<>();
     for (int startIndex = 0; startIndex < source.length(); startIndex ++) {
         int endIndex = startIndex + length;
         if (endIndex > source.length()) {
             endIndex = source.length();
             tokens.add(source.substring(startIndex, endIndex));
         }
     }
     return tokens;
    }

    private int compress(String s, int length) {
        StringBuilder builder = new StringBuilder();

        String last = "";
        int count = 0;
        for (String token : split(s, length)) {
            if (token.equals(last)) {
                count++;
            } else {
                if (count > 1) builder.append(count);
                builder.append(last);
                last = token;
                count = 1;
            }
        }
        if (count > 1) builder.append(count);
        builder.append(last);

        return builder.length();
    }

public int solution(String s) {

    int min = Integer.MAX_VALUE;
    for (int length = 1; length <= s.length(); length++) {
        int compressed = compress(s, length);
        if (compressed < min) {
            min = compressed;
        }
    }
    return min;
}

}
