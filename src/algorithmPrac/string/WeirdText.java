package algorithmPrac.string;

public class WeirdText {
    /**
     * @이상한_문자_만들기(p.114)
     * @https://programmers.co.kr/learn/courses/30/lessons/12930
     */


    public String solution(String str) {

        char[] arr = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(arr[i]));
            } else {
                result.append(Character.toLowerCase(arr[i]));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        WeirdText wt = new WeirdText();
        String str = "try hello world";

        System.out.println(wt.solution(str));
    }
}
