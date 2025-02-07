package algorithmPrac.string.regEx;

public class ManageString {

    /**
     * @문자열_다루기_기본_level1 (p.147)
     * @URL: https://programmers.co.kr/learn/courses/30/lessons/12918
     */

//    문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼 있는지 확인해주는 함수, solution 을 완성하세요.
//    예를 들어 s가 "a234"이면 False 를 리턴하고 "1234" 라면 True 를 리턴하면 됩니다.

    public boolean solution(String s) {

    return s.matches("^[0-9]{4}$|^[0-9]{6}$");

    }


    public static void main(String[] args) {
        ManageString s = new ManageString();
        boolean answer = s.solution("12234");
        System.out.println(answer);
    }
}
