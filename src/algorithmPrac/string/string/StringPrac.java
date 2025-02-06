package algorithmPrac.string.string;

public class StringPrac {

    private boolean isTrue(char str, int num) {
        int num2 = str - '0';

        if(num2 == num) return true;
        else return false;
    }


    public static void main(String[] args) {
//        StringPrac stringPrac = new StringPrac();
//
//        char str = '2';
//        int num = 2;
//        int num2 = Character.getNumericValue(str);
//
//        System.out.println(stringPrac.isTrue(str, num)); // true
//        System.out.println(stringPrac.isTrue(str, num2)); // true;
//
//        System.out.println(num2);

        // ############################
        // ####### 진수 변환 연습 ########
        // ############################

        String binary = "1010"; //문자열
        int value = Integer.parseInt(binary, 2);
            // 문자열"1010"을 이진법으로 해석하여 십진수로 변환
            // ex) "1010"(2진수) -> 10(10진수)

        String hex = Integer.toString(value, 16);
        int hexNum = Integer.parseInt(hex, 16);
            // 십진수 10을 16진수(hex) 문자열로 변환
            // ex) 10(10진수) -> "a" (16진수)

        System.out.println(binary);
        System.out.println(value);
        System.out.println(hex);
        System.out.println(hexNum);
    }
}
