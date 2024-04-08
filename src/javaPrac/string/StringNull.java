package javaPrac.string;

public class StringNull {
    public static void main(String[] args) {
        StringNull sample = new StringNull();
        sample.nullcheck2(null);

    }


    public boolean nullCheck(String text) {
        int textLength = text.length();
        System.out.println(textLength);

        if(text == null) return true;
        else return false;
    }

    public boolean nullcheck2(String text) {
        if (text == null) {
            System.out.println("true");
            return true;

        } else {
            int textLength = text.length();
            System.out.println(textLength);
            return false;
        }
    }

}
