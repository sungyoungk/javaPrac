package javaPrac.exception;

public class Practice {
    public static void main(String[] args) {
        Practice practice = new Practice();
        try {
            practice.printDivide(1,2);
            practice.printDivide(1,0);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void printDivide(double d1, double d2) throws Exception{


        try {
            if(d2 == 0) {
                throw new ArithmeticException("Second value cannot be Zero");
            }
            double result = d1/d2;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
