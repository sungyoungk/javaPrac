package algorithmPrac.string.notation;

public class BinaryPrac {

    private String str = "110010101001";
/** @이진_변환_반복하기_level2 (p.130)
 *  @URL: https://programmers.co.kr/learn/courses/30/lessons/70129
 */

    /**
     *      0과 1 로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.
     *        • x 의모든0을제거합니다.
     *        • x의 길이를 c라고 하면, x를 ’c를 2진법으로 표현한 문자열,로 바꿉니다.
     *      예를 들어 X = "0111010"이라면, X에 이진 변환을 가하면 x = "H0111010" -> "1111" -> "100"
     *      0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을
     *      때, 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함
     *      수를 완성해주세요.
     *
     */


    String string = "110010101001";




    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;
        int[] answer = new int[2];

        while(!s.equals("1")) {
            String zeroRemoved = removeZero(s);
            zeroCount += s.length() - zeroRemoved.length();

            String binaryStr = toBinary(zeroRemoved.length());
            count ++;

            s = binaryStr;
        }

        answer[0] = count;
        answer[1] = zeroCount;

        return answer;
    }

    private String removeZero(String source) {
        return source.replace("0", "");
    }

    private String toBinary(int length) {
        return Integer.toString(length, 2);
    }




    public static void main(String[] args) {
        BinaryPrac bp = new BinaryPrac();
        bp.solution("110010101001");
    }
}
