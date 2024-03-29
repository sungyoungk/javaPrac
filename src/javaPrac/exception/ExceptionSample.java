package javaPrac.exception;

public class ExceptionSample {
    public static void main(String[] args) {

        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBoundTryCatch();
    }

    public void arrayOutOfBounds(){
        int[] array = new int[5];
        System.out.println(array[5]);
    }

    public void arrayOutOfBoundTryCatch() {

        try{
            int[] array = new int[5];
            System.out.println(array[5]);
        } catch (Exception e){
            System.err.println("exception occured");
        }
        System.out.println("this code must run");

    }
}
