package algorithmPrac.string;

public class WeirdText {
    /**
     * @이상한_문자_만들기(p.114)
     * @https://programmers.co.kr/learn/courses/30/lessons/12930
     */


    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        boolean upper = true;

        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                builder.append(c);
                upper = true;
            } else {
                if (upper) {
                    builder.append(Character.toUpperCase(c));
                } else {
                    builder.append(Character.toLowerCase(c));
                }
                upper = !upper;
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        WeirdText wt = new WeirdText();
        String str = "try hello world";

        System.out.println(wt.solution(str));
    }
}
