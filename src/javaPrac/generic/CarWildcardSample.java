package javaPrac.generic;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        // sample.callBoundedWildcardMethod();
        sample.callBusBoundedWildcard();
    }

    public void callBoundedWildcardMethod() {
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        wildcard.setWildcard(new Car("MUSTANG"));
        boundedWildcardMethod(wildcard);

    }

    public void callBusBoundedWildcard() {
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
        wildcard.setWildcard(new Bus("6900"));
        boundedWildcardMethod(wildcard);

    }

    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Car value = c.getWildcard();
        System.out.println(value);
    }
}
