package javaPrac.lambda;

public class LambdaPrac {
    public static void main(String[] args) {
        LambdaPrac sample = new LambdaPrac();
        sample.calculateLambda();
    }


    public void calculateClassic() {
        Calculate calculateAdd = new Calculate(){
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };
        System.out.println(calculateAdd.operation(1,2));
    }

    public void calculateLambda() {
        Calculate calculateAdd = (a,b) -> a+b;
        System.out.println(calculateAdd.operation(1,2));

        Calculate calculateSubtract = (a,b) -> a-b;
        System.out.println(calculateSubtract.operation(2,1));
    }

    private void runThread() {

        new Thread(() ->{
            System.out.println(Thread.currentThread().getName());
        }
        ).start();

    }




}
