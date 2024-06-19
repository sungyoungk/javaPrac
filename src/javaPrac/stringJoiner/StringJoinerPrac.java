package javaPrac.stringJoiner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerPrac {
    public static void main(String[] args) {
        StringJoinerPrac sample = new StringJoinerPrac();
        String[] stringArray = new String[]{"studyHard", "GodOfJava", "Book"};
        //sample.joinString(stringArray);
        sample.withCollector(stringArray);

    }




    public void joinStringOnlyComma(String[] stringArray) {
        StringJoiner joiner = new StringJoiner(",");
        for (String s : stringArray) {
            joiner.add(s);
        }
        System.out.println(joiner);
    }

    public void joinString(String[] stringArray) {
        StringJoiner joiner = new StringJoiner(",","(",")");

        for (String s : stringArray) {
            joiner.add(s);
        }
        System.out.println(joiner);
    }

    public void withCollector(String[] stringArray) {
        List<String> stringList = Arrays.asList(stringArray);
        String result = stringList.stream()
                .collect(Collectors.joining(",","(",")"));
        System.out.println(result);
    }

}
