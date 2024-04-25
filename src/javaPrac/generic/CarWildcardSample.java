package javaPrac.generic;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
        sample.callBusBoundedWildcardMethod();

    }

public void callBoundedWildcardMethod() {
    WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
    wildcard.setWildcard(new Car("Mustang"));
    boundedWildcardMethod(wildcard);

}

    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Car value = c.getWildcard();
        System.out.println(value);
    }

    public void callBusBoundedWildcardMethod(){
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard(new Bus("No. 6900"));
        boundedWildcardMethod(wildcard);
    }


}
