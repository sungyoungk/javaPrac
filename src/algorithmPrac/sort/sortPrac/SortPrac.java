package algorithmPrac.sort.sortPrac;

import java.util.Arrays;

public class SortPrac {


    int[] intArr = {1, 2, 3, 4, 5};

    public int[] sortReverse(int[] arr) {

        return  Arrays.stream(arr)
                .boxed()
                .sorted((a1, a2) -> a2 - a1)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        SortPrac prac = new SortPrac();

        int[] intArr = {1, 2, 3, 4, 5};


        System.out.println(Arrays.toString(prac.sortReverse(intArr)));
    }

}
