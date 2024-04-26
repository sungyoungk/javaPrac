package javaPrac.collection;

import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
        StackSample sample = new StackSample();
        // sample.checkPeek();
        sample.checkPop();
    }


    public void checkPeek() {
        Stack<Integer> intStac = new Stack<Integer>();


        for (int loop = 0; loop < 5; loop++) {
            intStac.push(loop);
            System.out.println(intStac.peek());
        }
        System.out.println("size= " + intStac.size());
    }

    public void checkPop() {
        Stack<Integer> intStac = new Stack<Integer>();
        for (int loop = 0; loop < 5; loop++) {
            intStac.push(loop);
            System.out.println(intStac.pop());
        }
        System.out.println("size = " + intStac.size());
    }
}
