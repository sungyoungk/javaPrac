package javaPrac.thread;

public class RunSupportThread {
    public static void main(String[] args) {
        RunSupportThread sample = new RunSupportThread();
        // sample.checkThreadState();
        sample.checkJoin();

    }

    public void checkThreadState() {
        SleepThread thread = new SleepThread(2000);

        try {
            System.out.println("thread state = " + thread.getState());
            thread.start();
            System.out.println("thread state(after start) = " + thread.getState());

            // Thread.sleep(1000);
            System.out.println("thread state(after sleep) = " + thread.getState());

            thread.join();
            System.out.println("thread state(after join) = " + thread.getState());
            thread.interrupt();
            System.out.println("state(After join = " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkJoin() {
        SleepThread thread = new SleepThread(2000);
        try {

            thread.start();
            thread.join(2500);
            thread.interrupt();
            System.out.println("thread state(after join) : " + thread.getState());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
