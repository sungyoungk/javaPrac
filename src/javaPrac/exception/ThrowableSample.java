package javaPrac.exception;

public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        try{
            sample.throwException(19);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void throwable(){
        int[] intArray = new int[5];

        try {
            // intArray = null;
            // System.out.println(intArray.length);
            System.out.println(intArray[5]);
        } catch(Throwable t){
            // System.out.println(t.getMessage());
            System.out.println(t.getCause());
        }
    }

    public void throwException(int number) throws Exception{
        try{
            if (number > 12) {
                throw new IllegalArgumentException("number is over than 12");
            }
            System.out.println("number is  " + number);
        }
        catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
