package javaPrac.forkJoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinSample {
    static final ForkJoinPool mainpool = new ForkJoinPool(); //ForkJoinPool이라는 객체 생성

    public static void main(String[] args) {
        ForkJoinSample sample = new ForkJoinSample();
        sample.calculate();
    }

    public void calculate() {
        long from = 0;
        long to = 10;

        GetSum sum = new GetSum(from, to);
        Long result = mainpool.invoke(sum);
        System.out.println("Fork Join: Total sum of " + from +
                " ~" + to + " = " + result);

    }




}
