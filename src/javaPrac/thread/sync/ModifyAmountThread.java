package javaPrac.thread.sync;

public class ModifyAmountThread extends Thread {
    private CommonCalculate calc;
    private boolean addFlag;

    public ModifyAmountThread(CommonCalculate calc, boolean addFlag) {
        this.calc = calc;
        this.addFlag = addFlag;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (addFlag) {
                calc.plus(1);
                calc.minus(1);
            } else {
                calc.minus(1);
            }
        }
    }
}
