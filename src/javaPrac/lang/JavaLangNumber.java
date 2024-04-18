package javaPrac.lang;

public class JavaLangNumber {
    public static void main(String[] args) {
        JavaLangNumber sample = new JavaLangNumber();
        // sample.numberTypeCheck();
        // sample.numberMinMaxCheck();
        // sample.integerMinMaxToBinary();
        sample.numberMinMaxElapedCheck();
    }

    public void numberTypeCheck() {
        String value1 = "3";
        String value2 = "5";
        // parseByte : 기본 자료형 리턴
        byte byte1 = Byte.parseByte(value1);
        byte byte2 = Byte.parseByte(value2);
        System.out.println(byte1 + byte2);

        // valueOf : 참조자료형 리턴
        Integer refInt1 = Integer.valueOf(value1);
        Integer refInt2 = Integer.valueOf(value2);
        System.out.println(refInt1+refInt2+ "7");
    }

    public void numberMinMaxCheck() {
        System.out.println("byte min = " + Byte.MIN_VALUE);
        System.out.println("byte max = " + Byte.MAX_VALUE);

        System.out.println("short min" + Short.MIN_VALUE);
        System.out.println("short max" + Short.MAX_VALUE);

        System.out.println("long min" + Long.MIN_VALUE);
        System.out.println("long max" + Long.MAX_VALUE);

        System.out.println("float min" + Float.MIN_VALUE);
        System.out.println("float max" + Float.MAX_VALUE);

        System.out.println("double min" + Double.MIN_VALUE);
        System.out.println("double max" + Double.MAX_VALUE);

        System.out.println("char min" + (int) Character.MIN_VALUE);
        System.out.println("char max" + (int) Character.MAX_VALUE);
    }

    public void integerMinMaxToBinary() {
        System.out.println("Integer Binary min" + Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println("Integer Binary max" + Integer.toBinaryString(Integer.MAX_VALUE));

        System.out.println("Integer hex min" + Integer.toHexString(Integer.MIN_VALUE));
        System.out.println("Integer hex max" + Integer.toHexString(Integer.MAX_VALUE));


    }

    public void numberMinMaxElapedCheck() {
        JavaLangNumber numberSample = new JavaLangNumber();
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        numberSample.numberMinMaxCheck();
        System.out.println("Milli second="+(System.currentTimeMillis()-startTime));
        System.out.println("nano second = " + (System.nanoTime() - startNanoTime));
    }
}
