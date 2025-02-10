package algorithmPrac.string.regEx;

public class NewId {
    /**
     * @신규_아이디_추천_level1 (p.149)
     * @URL: https://programmers.co.kr/learn/courses/30/lessons/72410
     */


//    카카오에 입사한 신입 개발자 네오는 ’카카오계정개발팀’에 배치되어, 카카오 서비스에 가입하는 유저들의 아 이디를 생성하는 업무를 담당하게 되었습니다.
//    ‘네오‘에게 주어진 첫 업무는 새로 가입하는 유저들이 카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때, 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주 는 프로그램을 개발하는 것입니다.

//    다음은 카카오 아이디의 규칙입니다.
//      • 아이디의 길이는 3자 이상 15자 이하여야합니다.
//      • 아이디는 알파벳 소문자, 숫자, ।빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
//      • 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.

//    1 단계 new_id 의 모든 대문자를 대응되는 소문자로 치환합니다.
//    2단계 newjd에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//    3단계 newjd에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
//    4단계 newjd에서 마침표(.)가 처음이나끝에 위치한다면 제거합니다.
//    5단계 newjd가 빈 문자열이라면, newjd에 "a"를 대입합니다.
//    6단계 newjd의 길이가 16자 이상이면, newjd의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합 니다.
//         만약 제거 후 마침표(.)가 newjd의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
//    7단계 newjd의 길이가 2자 이하라면, newjd의 마지막 문자를 newjd의 길이가 3이 될 때까지 반복해 서 끝에 붙입니다.


    public String solution(String new_id) {
        String newId = new_id.toLowerCase().replaceAll("[^a-z0-9\\-_.]","");
        newId = newId.replaceAll("\\.+", ".");
        newId = newId.replaceAll("^\\.+|\\.+$","");
        if (newId.isEmpty()) newId = "a";
        if (newId.length() >= 16) newId = newId.substring(0, 15);
        newId = newId.replaceAll("\\.+$", "");

       while (newId.length() < 3) {
           newId += newId.charAt(newId.length() -1);
       }

       return newId;
    }
}
