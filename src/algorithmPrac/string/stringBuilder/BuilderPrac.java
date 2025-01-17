package algorithmPrac.string.stringBuilder;

public class BuilderPrac {



    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for(char c = 'a'; c <= 'z'; c++ ){
            sb.append(c);
        }

        String str = sb.toString();
        System.out.println(str);

    }
}
