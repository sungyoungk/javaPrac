package javaPrac.exception;

public class FinallySample {
    public static void main(String[] args) {
        FinallySample sample = new FinallySample();
        sample.finallySample();

    }

    public void finallySample(){
        int[] intArray = new int[5];

        try{
            System.out.println(intArray[4]);
        } catch(Exception e) {
            System.out.println(intArray.length);
        } finally {
            System.out.println("here is finally");
        }
        System.out.println("this code must run");
    }
}
