package algorithmPrac.string.reverse;

/**
 * @자연수_뒤집어_배열로_만들기 p.107
 * @LV.1
 * @URL https://programmers.co.kr/learn/courses/30/lessons/12932
 */
public class Solution {
                        //12345 -? 54321
    public int[] solution(long n) {
        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();

        char[] arr = reversed.toCharArray();
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            result[i] = arr[i] - '0';
        }
        return result;
    }
}
