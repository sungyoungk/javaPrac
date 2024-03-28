package javaPrac.enums;

public class OvertimeManager3 {
    public static void main(String[] args) {
        OverTimeValues2[] valueList = OverTimeValues2.values();
        for (OverTimeValues2 value : valueList) {
            System.out.println(value);
        }
    }
}
