package javaPrac.enums;

public class OverTimeManager2 {
    public static void main(String[] args) {
        OverTimeValues2 values2 = OverTimeValues2.THREE_HOUR;
        System.out.println(values2);
        System.out.println(values2.getAmount());

        OverTimeValues2 vales3 = OverTimeValues2.FIVE_HOUR;
        System.out.println(values2.compareTo(vales3));

    }
}
