package algorithmPrac.stringMethod.substring;

import java.util.ArrayList;
import java.util.List;

public class Compress5 {

    /**
     * @문자열_압출_level2 p.120
     * @URL: https://programmers.co.kr/learn/courses/30/lessons/60057
     */
    //



        private List<String> split(String str, int length) {

            List<String> tokens = new ArrayList<>();

            for(int startIndex = 0; startIndex < str.length(); startIndex += length) {
                int endIndex = startIndex + length;
                if(endIndex > str.length()) endIndex = str.length();
                tokens.add(str.substring(startIndex, endIndex));
            }

            return tokens;
        }

        private int compress(String str, int length) {
          StringBuilder builder = new StringBuilder();

            String last = "";
            int count = 0;

            for(String token : split(str, length)) {
                if(token.equals(last)) {
                    count ++;
                } else {
                    if(count > 1) {
                        builder.append(count);
                    }
                    builder.append(last);
                    last = token;
                    count = 1;
                }
            }
            if(count > 1) {
                builder.append(count);
            }
            builder.append(last);
            return builder.length();
        }

        public int solution(String str) {
            int min = Integer.MAX_VALUE;

            for(int length = 1; length <= str.length(); length++) {
                int compressed = compress(str, length);

                if(compressed < min) min = compressed;
            }

            return min;
        }

    public static void main(String[] args) {
        Compress5 c = new Compress5();

        String str = "aabbaccc";
        System.out.println(c.solution(str));
    }
}
