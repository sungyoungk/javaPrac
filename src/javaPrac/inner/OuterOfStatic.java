package javaPrac.inner;

public class OuterOfStatic {

    static class StaticNested {

        private int value;

        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
}
