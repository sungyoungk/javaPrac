package algorithmPrac.string.string;

public class StringPrac {

    private boolean isTrue(char str, int num) {
        int num2 = str - '0';

        if(num2 == num) return true;
        else return false;
    }


    public static void main(String[] args) {
        StringPrac stringPrac = new StringPrac();

        char str = '2';
        int num = 2;
        int num2 = Character.getNumericValue(str);

        System.out.println(stringPrac.isTrue(str, num)); // true
        System.out.println(stringPrac.isTrue(str, num2)); // true;

        System.out.println(num2);
    }
}
