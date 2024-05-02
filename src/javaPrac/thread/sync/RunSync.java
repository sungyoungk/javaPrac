package javaPrac.thread.sync;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        for (int i = 0; i < 5; i++) {
            runSync.runCommonCalculate();
        }

    }

    public void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            System.out.println("final value is" + calc.getAmount());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
