package algorithmPrac.string.string;

public class AsciiCode {


    public static void main(String[] args) {
        String lower = Character.toString('e') + "/";
        char ascii = (char)('e' - 'E');

        int e1 = (int)'e';
        int e2 = (int)'E';

        char b1 = 'b';
        char b2 = (char)('B' + ('a' - 'A'));
        System.out.println((char)b2);

        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));


    }
}
