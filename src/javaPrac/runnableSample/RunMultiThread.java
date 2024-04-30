package javaPrac.runnableSample;

public class RunMultiThread {
    public static void main(String[] args) {
        RunMultiThread sample = new RunMultiThread();
        sample.runMultiThread();

    }

    public void runMultiThread() {
        RunnableSample[] runnable = new RunnableSample[5];
        ThreadSample[] thread = new ThreadSample[5];

        for (int loop = 0; loop < 5; loop++) {
            runnable[loop] = new RunnableSample();
            thread[loop] = new ThreadSample();

            new Thread(runnable[loop]).start();
            thread[loop].start();
        }
        System.out.println("RunMultiThread.runMultiThread() method is ended");
    }
}
