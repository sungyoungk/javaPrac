package javaPrac.stream;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrac {
    public static void main(String[] args) {
        StreamPrac sample = new StreamPrac();
        sample.tostream();
    }

    public void tostream() {
        Integer[] values = {1, 3, 5};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(values));
        for (Integer i : list) {
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.println("===");


        List<Integer> list2 = Arrays.stream(values).collect(Collectors.toList());
        for (Integer j : list2) {
            System.out.print(j + " ");
        }
    }

}
