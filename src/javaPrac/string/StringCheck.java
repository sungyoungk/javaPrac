package javaPrac.string;

import java.util.Locale;

public class StringCheck {
    public static void main(String[] args) {
        StringCheck sample = new StringCheck();

        String[] address = new String[]{
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동 개발 공장",
                "서울시 구로구 개봉동"
        };
        // sample.checkSubString();
        // sample.checkSplit();
        // sample.checkReplace();
        // sample.checkFormat();
        sample.checkCase();
    }

    public void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0;
        String startText = "서울시";
        String endText = "동";
        for (String address : addresses) {
            if (address.startsWith(startText)) {
                startCount ++;
            }
            if (address.endsWith(endText)) {
                endCount++;
            }
        }
        System.out.println("start with " + startText + " count= " + startCount);
        System.out.println("endWith " + endText + " count= " + endCount);

    }

    public void containsCheck(String[] addresses){
        int containCount = 0;
        String containsText = "구로";

        for (String address : addresses) {
            if (address.contains(containsText)) {
                containCount++;
            }
        }
        System.out.println("contains + " + containsText + " = " + containCount);
    }

    public void checkMatch(){
        String text = "this is a text";
        String compare1 = "is";
        String compare2 = "this";
        System.out.println(text.regionMatches(2, compare1, 0, 1));
        System.out.println(text.regionMatches(5, compare1, 0, 2));
        System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
    }

    public void checkIndexOf(){
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a', 20));
        System.out.println(text.indexOf("a ", 20));
        System.out.println(text.indexOf('z'));
    }

    public void checkLastIndexOf(){
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a', 20));
        System.out.println(text.lastIndexOf("a", 20));
        System.out.println(text.lastIndexOf('z'));

    }

    public void checkCharAt(){
        String txt = "abcdefg";
        int i = txt.indexOf("b");
        System.out.println("txt.IndexOf('b') = " + txt.indexOf("b") );
        System.out.println("charAt = " + txt.charAt(i));
    }

    public void checkCopyValueOf(){
        char[] array = new char[] {'a','b','c'};
        String text = String.copyValueOf(array);
        String text2 = String.copyValueOf(array, 0, 2);
        System.out.println(text);
        System.out.println(text2);
    }

    public void checkSubString() {
        String txt = "java technology";
        String technology = txt.substring(5);
        String java = txt.substring(0,4);
        String tech = txt.substring(5, 9);
        System.out.println(txt);
        System.out.println(java);
        System.out.println(tech);
    }

    public void checkSplit(){
        String text = "Java technology is both a language and a platform";
        String[] splitArray = text.split(" ");
        for (String temp : splitArray) {
            System.out.println(temp);
        }
    }

    public void checkTrim() {
        String[] strings = new String[]{
          "a", " b ", "    c", "d   ", "e     f"
        };

        String text = " a";
        if (text != null && text.trim().length() > 0) {
            System.out.println("ok");
        }

        for (String string : strings) {
            System.out.println("[" + string.trim() +"]");
            System.out.println("[" + string +"]");

        }
    }

    public void checkReplace() {
        String text = "The String class represents character strings.";
        System.out.println(text.replace('s', 'z'));
        System.out.println(text);

        System.out.println(text.replace("tring", "trike"));
        System.out.println(text.replaceAll(" ", "|"));
        System.out.println(text.replace(" ", "|"));
        System.out.println(text.replaceFirst(" ", "|"));
    }

    public void checkFormat() {
        String text = "제 이름은 %s입니다. 지금까지%d 권의 책을 썻고, "
                + "하루에 %f  %%의 시간을 책을 쓰는데 할애하고 있습니다.";

        String realText = String.format(text, "이상민", 7, 10.5);
        System.out.println(realText);
        System.out.format(text, "이상민", 7, 10.5);
    }

    public void checkCase(){
        String text = "AaBbCc";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase(Locale.KOREA));
    }



}