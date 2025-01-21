package algorithmPrac.string;

public class CaesarPassword2 {
    /**
     * @시저암호-Level 1, p.110
     * https://programmers.co.kr/learn/courses/30/lessons/12926
     */

    private char push(char c, int n) {
        if(!Character.isAlphabetic(c)) return c;
        int offset = (Character.isUpperCase(c)) ? 'A' : 'a';
        int position = c - offset;
        position = (char) (position + n) % ('Z' - 'A' + 1);
        return (char) (offset + position);
    }

    public String solution(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()) {
            sb.append(push(c, n));
        }
        return sb.toString();
    }
}
