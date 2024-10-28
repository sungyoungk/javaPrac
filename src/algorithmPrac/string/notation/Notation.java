package algorithmPrac.string.notation;

public class Notation {
    /** @3진법_뒤집기_level1 - p.128
     *  @URL: https://programmers.co.kr/learn/courses/30/lessons/68935
     */


    int n = 45;


    public long solution(int n) {

      String num = Long.toString(n, 3);
      String reversed = new StringBuilder(num).reverse().toString();

      return Long.parseLong(reversed, 3);

    }

    public static void main(String[] args) {

        int n = 45;

        Notation notation = new Notation();
        System.out.println(notation.solution(n));
    }

}
