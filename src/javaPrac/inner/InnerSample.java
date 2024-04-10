package javaPrac.inner;

public class InnerSample {
    public static void main(String[] args) {
        InnerSample sample = new InnerSample();
        sample.makeInnerObject();
    }

    public void makeInnerObject() {
        OutOfInner outer = new OutOfInner();

        OutOfInner.Inner inner = outer.new Inner();
        inner.setValue(3);
        int value = inner.getValue();
        System.out.println(value);
    }
}
