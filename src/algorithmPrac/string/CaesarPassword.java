package algorithmPrac.string;

public class CaesarPassword {
    /**
     * @시저암호-Level 1, p.110
     * https://programmers.co.kr/learn/courses/30/lessons/12926
     */

    private char push(char c, int n) {
        if(!Character.isAlphabetic(c)) return c;

        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;

        position = (position + n) % ('Z' - 'A' + 1);

        return (char) (offset + position);
    }

    public String Solution(String s, int n) {

        StringBuilder builder = new StringBuilder();
        for(char c : s.toCharArray()){
            builder.append(push(c, n));
        }
        return builder.toString();
}

    public static void main(String[] args) {
        CaesarPassword c = new CaesarPassword();
        String s = "ABCDefgHIJKlmnOPQRstuVWXYz";

        System.out.println(c.Solution(s, 2));


    }

}
