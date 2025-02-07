package algorithmPrac.string.UpperLowerReplace;

import java.util.function.DoubleToIntFunction;

public class Replace {
    /**
     * @숫자_문자열과_영단어_level1
     * @URL: https://programmers.co.kr/learn/courses/30/lessons/81301
     */

    String[] nums = {
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

        for(int i = 0; i < nums.length; i++) {
            s = s.replace(nums[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Replace r = new Replace();
        r.solution("one4seveneight");

        System.out.println(r.solution("one4seveneight"));
    }
}
