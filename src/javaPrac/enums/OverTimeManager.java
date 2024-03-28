package javaPrac.enums;

public class OverTimeManager {
    public int getOverTimeAmount(OverTimeValues values) {
        int amount = 0;
        System.out.println(values);
        switch (values) {
            case THREE_HOUR :
                amount = 18000;
                break;
            case FIVE_HOUR:
                amount = 30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount = 40000;
                break;
            case WEEKEND_FIVE_HOUR:
                amount = 60000;
                break;
        }
        return amount;
    }

    public static void main(String[] args) {
        OverTimeManager manager = new OverTimeManager();
        OverTimeValues value = OverTimeValues.THREE_HOUR;
        int myAmount = manager.getOverTimeAmount(value);
        System.out.println(myAmount);
    }
}
