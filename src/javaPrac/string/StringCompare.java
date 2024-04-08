package javaPrac.string;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
        //sample.checkString();
        sample.checkCompareTo();

    }

    public void checkString() {
        String text = "abc";
        System.out.println("text.length() = " + text.length());
        System.out.println("text.isEmpty() = " + text.isEmpty());
    }

    public void checkCompare() {
        String text = "Check value";
        String text2 = "Check value";
        String text3 = "check value";

        if (text == text2) {
            System.out.println("text == text2 ?: " + " yes");
        } else {
            System.out.println("text == text2 ?: " + " no, different");
        }

        if (text.equals("Check value")) {
            System.out.println("text.equals(text2)= :" + " yes");
        }

        if (text.equalsIgnoreCase(text3)) {
            System.out.println("text.equalsIgnoreCase :" + " yes");
        }
    }

    public void checkCompareTo() {
        String a = "a";
        String b = "b";
        String c = "c";

        System.out.println(b.compareTo(a));
        System.out.println(b.compareTo(c));
        System.out.println(b.compareTo(b));
    }


}
