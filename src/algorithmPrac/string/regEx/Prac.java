package algorithmPrac.string.regEx;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Prac {




    public String[] regEx(String[] arr) {
      return  Arrays.stream(arr)
                .filter(s -> s.matches("[ab][ab].*"))
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] arr = {"abcd","bcd","ab","aac\""};


        for(String string : arr){
           string =  string.replaceAll("[~!@#$%^&*()_+\"'/><|]", "A");
            System.out.println(string);
        }
    }

}
