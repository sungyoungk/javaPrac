package algorithmPrac.string;

public class StringReverse {


    public int[] solution() {

      int n = 12345;

        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();

        char[] arr = reversed.toCharArray();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] - '0';
        }
        return result;
    }

    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();
        stringReverse.solution();

    }


    }


