package javaPrac.thread;

import javaPrac.runnableSample.ThreadSample;

public class RunDaemonThreads {
    public static void main(String[] args) {
        RunDaemonThreads sample = new RunDaemonThreads();
        sample.runDaemonThread();

//        DaemonThread thread = new DaemonThread();
//        thread.start();
    }

    public void checkThreadProperty() {
        ThreadSample thread1 = new ThreadSample();
        ThreadSample thread2 = new ThreadSample();
        ThreadSample daemonThread = new ThreadSample();

        System.out.println("thread1(id) : " + thread1.getId());
        System.out.println("thread2(id) : " + thread2.getId());

        System.out.println("thread1(name) : " + thread1.getName());
        System.out.println("thread2(name) : " + thread2.getName());

        System.out.println("thread1 priority : " + thread1.getPriority());

        daemonThread.setDaemon(true);
        System.out.println("thread1 is Daemon : " + thread1.isDaemon());
        System.out.println("deamon is Deamon : " + daemonThread.isDaemon());

    }

    public void runDaemonThread() {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }
}
