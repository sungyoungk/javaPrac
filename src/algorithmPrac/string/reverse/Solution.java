package algorithmPrac.string.reverse;

/**
 * @자연수_뒤집어_배열로_만들기 p.107
 * @LV.1
 * @URL https://programmers.co.kr/learn/courses/30/lessons/12932
 */
public class Solution {
    //12345 -? 54321
    public int[] solution(long n) {
        String str = new StringBuilder(Long.toString(n)).reverse().toString();
        int[] arr = new int[str.length()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = str.toCharArray()[i] - '0';
        }
        return arr;
    }
}
