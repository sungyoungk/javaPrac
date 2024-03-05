package javaPrac.arrayPrac;

public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength array = new ArrayLength();
        // array.printArrayLength();

        //array.printArray();

        // array.newFor();

        // array.newFor2();
        array.newForWithCounter();

        if (args.length > 0) {
            System.out.println(args);
        }
    }

    public void printArrayLength() {
        int[] oneDim = new int[3];
        int[][] twoDim = new int[4][2];
        System.out.println(oneDim.length);
        System.out.println(twoDim.length);
    }

    public void printArray() {
        int[][] twoDim = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("twoDim.length = " + twoDim.length);
        System.out.println("twoDim[0].length = " + twoDim[0].length);

        for (int oneLoop = 0; oneLoop < twoDim.length; oneLoop++) {
            for (int twoLoop = 0; twoLoop < twoDim[oneLoop].length; twoLoop++) {
                System.out.println("twoDim[" + oneLoop + "]" + "[" + twoLoop + "] = " + twoDim[oneLoop][twoLoop]);
            }
        }
    }

    public void newFor() {
        int[] oneDim = new int[]{1, 2, 3, 4, 5};
        for (int data : oneDim) {
            System.out.println(data);
        }
    }

    public void newFor2() {
        int[][] twoDim = new int[][]{{1, 2, 3}, {4, 5, 6}};

        System.out.println("twoDim.length = " + twoDim.length);
        System.out.println("twoDim[0].length = " + twoDim[0].length);

        for (int[] twoDimArray : twoDim) {
            for (int intData : twoDimArray) {
                System.out.println(intData);
            }
        }
    }

    public void newForWithCounter() {
        int[][] twoDim = {{1, 2, 3},{4, 5, 6}};
        int onecounter = 0;

        for (int[] intArray : twoDim) {
           int twoCounter = 0;
            for (int intData : intArray){
                System.out.println("twoDim[" + onecounter + "][" + twoCounter + "] = " + intData);
                twoCounter ++;
            }
            onecounter ++;
        }
    }
}
