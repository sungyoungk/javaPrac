package javaPrac.thread.object;

public class RunObjectThreads {
    public static void main(String[] args) {
        RunObjectThreads sample = new RunObjectThreads();
        sample.checkThreadState3();

    }

    public void checkThreadState2() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        try {
            System.out.println("thread state : " + thread.getState());
            thread.start();
            System.out.println("state : " + thread.getState());

            Thread.sleep(100);
            System.out.println("state after 0.1 sec : " + thread.getState() );

            synchronized (monitor) {
                monitor.notify();
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify)" + thread.getState());

            thread.join();
            System.out.println("state(after join): " + thread.getState());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkThreadState3() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);

        try {

            System.out.println("T state: " + thread.getState());
            thread.start();
            thread2.start();
            System.out.println("T state(after start): " + thread.getState());

            Thread.sleep(100);
            System.out.println("T state(After 0.1s sleep :" + thread.getState());
            synchronized (monitor) {
                monitor.notifyAll();


            }

            Thread.sleep(100);
            System.out.println("T state(after 0.1s sleep_ : " + thread.getState());

            System.out.println("activeAccount: " + Thread.activeCount());

            thread.join();
            System.out.println("T state(after join): " + thread.getState());

            thread2.join();
            System.out.println("T2 state(after join): " + thread2.getState());
            System.out.println("activeAccount: " + Thread.activeCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
