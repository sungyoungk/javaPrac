package algorithmPrac.string;

public class WeirdText {
    /**
     * @이상한_문자_만들기(p.114)
     * @https://programmers.co.kr/learn/courses/30/lessons/12930
     */


    public String solution(String str) {
        boolean toUpper = true;
        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()) {
            if(!Character.isAlphabetic(c)) {
                sb.append(c);
                toUpper = true;
            } else {
                if(toUpper) {
                   sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        WeirdText wt = new WeirdText();
        String str = "try hello world";

        System.out.println(wt.solution(str));
    }
}
