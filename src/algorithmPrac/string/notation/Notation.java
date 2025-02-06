package algorithmPrac.string.notation;

public class Notation {
    /** @3진법_뒤집기_level1 - p.128
     *  @URL: https://programmers.co.kr/learn/courses/30/lessons/68935
     */

    // 자연수 n이 매개변수로 주어집니다.
    // n을 3진법 상에서 앞뒤로 뒤집은 후,
    // 이를 다시 10진법으로 표현한 수를 return

    int n = 45;


    public long solution(int n) {
        String reversed = new StringBuilder(Integer.toString(n, 3))
                .reverse()
                .toString();

        return (long) Integer
                .parseInt(reversed, 3);
    }

    public static void main(String[] args) {
        int n = 45;

        Notation notation = new Notation();
        System.out.println(notation.solution(n));
    }
}
