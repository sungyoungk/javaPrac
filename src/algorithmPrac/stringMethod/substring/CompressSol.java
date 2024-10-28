package algorithmPrac.stringMethod.substring;

import java.util.ArrayList;
import java.util.List;

public class CompressSol {

    /**
     * @문자열_압출_level2 p.120
     * @URL: https://programmers.co.kr/learn/courses/30/lessons/60057
     */
    //
    String str = "aabbaccc";

    private List<String> split(String str, int length) {
        List<String> tokens = new ArrayList<>();

        for (int startIndex = 0; startIndex < str.length(); startIndex += length) {
            int endIndex = Math.min(startIndex + length, str.length());
            tokens.add(str.substring(startIndex, endIndex));
        }
        return tokens;
    }

    public int compress(String str, int length) {
        if (length >= str.length()) {
            return str.length();
        }

        StringBuilder builder = new StringBuilder();
        String last = "";
        int count = 0;

        for (String token : split(str, length)) {
            if (token.equals(last)) {
                count++;
            } else {
                if (count > 1) {
                    builder.append(count);
                }
                if (!last.isEmpty()) {
                    builder.append(last);
                }
                last = token;
                count = 1;
            }
        }

        // 마지막 토큰 처리
        if (count > 1) {
            builder.append(count);
        }
        builder.append(last);

        return builder.length();
    }

    public int solution(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int min = str.length();  // 초기값을 문자열 길이로 설정

        for (int length = 1; length <= str.length(); length++) {
            int compressed = compress(str, length);
            min = Math.min(min, compressed);
        }

        return min;
    }

    public static void main(String[] args) {
        CompressSol c = new CompressSol();
        String str = "aabbaccc";
        System.out.println(c.solution(str));  // 예상 출력: 7 ("2a2ba3c")
    }
}
