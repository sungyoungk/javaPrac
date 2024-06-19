package javaPrac.parallelArraySort;

import java.util.Arrays;

public class ParallelArraySort {
    public static void main(String[] args) {
        ParallelArraySort sample = new ParallelArraySort();
        sample.sort();
    }

    public void sort() {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.parallelSort(intArray);

        for (int intValue : intArray) {
            System.out.println(intValue);
        }
    }
}
