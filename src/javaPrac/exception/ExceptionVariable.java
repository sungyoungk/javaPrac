package javaPrac.exception;

public class ExceptionVariable {
    public static void main(String[] args) {
        ExceptionVariable variable = new ExceptionVariable();
        variable.checkVariable();
    }

    public void checkVariable(){
        int[] intArray = null;

        try{
            intArray = new int[5];
            System.out.println(intArray[5]);
        } catch(Exception e) {
            System.out.println(intArray.length);
        }
        System.out.println("this code must run");
    }
}
