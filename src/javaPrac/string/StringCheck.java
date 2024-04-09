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
        sample.checkIndexOf();

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
        System.out.println("count[" + containText + "] = " + containCount );
    }

    public void checkMatch() {
        String text = "This is text";
        String compare1 = "is";
        String compare2 = "this";
        String compare3 = "text";

        System.out.println(text.regionMatches(2, compare1, 0, 1));
        System.out.println(text.regionMatches(true,0, compare2, 0,4));
        System.out.println(text.regionMatches(true, 8, compare3, 0,1));
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


}