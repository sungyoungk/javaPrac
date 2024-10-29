package algorithmPrac.string.UpperLowerReplace;

import java.util.function.DoubleToIntFunction;

public class Replace {
    /**
     * @숫자_문자열과_영단어_level1
     * @URL: https://programmers.co.kr/learn/courses/30/lessons/81301
     */
    String[] numbers = {
            "zero"
            ,"one"
            ,"two"
            ,"three"
            ,"four"
            ,"five"
            ,"six"
            ,"seven"
            ,"eight"
            ,"nine"
    };

    public int solution(String s) {

      for(int i = 0; i < numbers.length; i++) {
         s = s.replace(numbers[i], Integer.toString(i));
      }
        System.out.println(s);
      return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Replace r = new Replace();
        r.solution("one4seveneight");
    }
}
