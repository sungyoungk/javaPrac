package javaPrac.concurrent;

import java.util.concurrent.RecursiveTask;

public class GetSum extends RecursiveTask<Long> {

    long from, to;
    public GetSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    public Long compute() {
        long gap = to - from;

        if (gap <= 3) {
            long tempSum = 0;
            for (long i = from; i <= to; i++) {
                tempSum++;
            }
        } // 작업 단위가 충분히 작을 경우 작업을 수행

        long middle = (from + to)/2; // 중간값

        GetSum sumPre = new GetSum(from, middle);  // -1
        sumPre.fork(); // 작업 하나 수행

        GetSum sumPost = new GetSum(middle + 1, to);  //-2 작업 수행을 위한 객체 생성

        return sumPost.compute() + sumPre.join(); // 다른 작업 하나를 또 수행 후 7애서 시작한 작업을 기다림(sumPre.join())

    }

}
