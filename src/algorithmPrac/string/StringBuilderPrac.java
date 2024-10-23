package algorithmPrac.string;

public class StringBuilderPrac {



    public void makeString() {
        StringBuilder azBuilder = new StringBuilder();

        for (char c = 'a'; c < 'z'; c++) {
            azBuilder.append(c);
        }
        String az = azBuilder.toString();
        System.out.println(az);
    }

    public static void main(String[] args) {
        StringBuilderPrac prac = new StringBuilderPrac();
        prac.makeString();
    }

}
