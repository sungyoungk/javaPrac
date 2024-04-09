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

        // sample.checkAddress(address);
        // sample.containAddress(address);
        // sample.checkMatch();
        // sample.checkCharAt();
        // sample.checkCopyValueOf();
        // sample.checkToCharArray();
        // sample.checkSubstring();
        // sample.checkSubstring();
        //sample.checkSplit();
        //sample.checkTrim();
        //sample.checkReplace();
        // sample.checkFormat();
        sample.checkStringbuilderAndBuffer();


    }

    public void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0;

        String startText = "서울시";
        String endText = "동";

        for (String address : addresses) {
            if (address.startsWith(startText)) {
                startCount++;
            }
            if (address.endsWith(endText)) {
                endCount++;
            }
        }
        System.out.println("count_startsW/ " + startText + " =" + startCount);
        System.out.println("count_endW/ " + endText + " =" + endCount);
    }

    public void containAddress(String[] addresses) {
        int containCount = 0;
        String containText = "구로";

        for (String address : addresses) {
            if (address.contains(containText)) {
                containCount++;
            }
        }
        System.out.println("count[" + containText + "] = " + containCount);
    }

    public void checkMatch() {
        String text = "This is text";
        String compare1 = "is";
        String compare2 = "this";
        String compare3 = "text";

        System.out.println(text.regionMatches(2, compare1, 0, 1));
        System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
        System.out.println(text.regionMatches(true, 8, compare3, 0, 1));
    }

    public void checkIndexOf() {
        // String text = "Java technology is both a programming language and a platform.";
        String text = "Java technology is both a programming language and a platform.";

        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a', 20));
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf('z'));

    }

    public void checkCharAt() {
        String text = "java is a technology.";

        int index = text.indexOf('a');
        System.out.println(text.charAt(index));
    }

    public void checkCopyValueOf() {
        char[] array = new char[]{'a', 'b', 'c'};
        String copiedValue = String.copyValueOf(array);
        String copiedValue2 = String.copyValueOf(array, 0, 2);
        System.out.println(copiedValue);
        System.out.println(copiedValue2);
    }

    public void checkToCharArray() {
        String sValue = "java is a technology";
        char[] charArray = sValue.toCharArray();

        for (char data : charArray) {
            System.out.print(data);
        }
    }

    public void checkSubstring() {
        String text = "Java technology";
        String technology = text.substring(5);
        String tech = text.substring(5, 9);
        System.out.println(technology);
        System.out.println(tech);
    }

    public void checkSplit() {
        String text = "Java technology is both a programming language and a platform.";
        String[] splitArray = text.split(" ");
        for (String data : splitArray) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public void checkTrim() {
        String[] strings = {
                " a", " b ", "   c", "d    ", "e   f", "   "
        };

        for (String data : strings) {
            System.out.println("[" + data + "] ");
            System.out.println("[" + data.trim() + "]");
        }
    }

    public void checkReplace() {
        String text = "The String class represents character strings";
        System.out.println(text.replace('s', 'z'));
        System.out.println(text);
        System.out.println(text.replace("tring", "trike"));
        System.out.println(text.replaceAll(" ", "|"));
        System.out.println(text.replace(" ", "|"));
        System.out.println(text.replaceFirst(" ", "|"));
    }

    public void checkFormat() {
        String text = "제 이름은 %s 입니다. 지금까지 %d 권의 책을 썻고,"
                + "하루에 %f %%의 시간을 책을 쓰는데 할애하고 있습니다";

        String realText = String.format(text, "이상민,", 7, 10.5);
        System.out.println(realText);
    }

    public void checkValueOf() {
        int one = 1;
        float onePone = 1.1f;

        String sOne = String.valueOf(one);
        String sOnePone = String.valueOf(onePone);

    }

    public void checkStringbuilderAndBuffer() {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" world");
        System.out.println(sb);

        String string = "hi";
        CharSequence cs = new StringBuilder(string);
        cs.

    }

}