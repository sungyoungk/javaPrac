package javaPrac.generic;

public class GenericWildcardSample {
    public static void main(String[] args) {
        GenericWildcardSample sample = new GenericWildcardSample();

        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();

        sample.callGenericMethod(wildcard, new Car("Mustang"), new Bus("1690"));



    }

    public <S, T extends Car> void callGenericMethod(WildcardGeneric<T> c, T addValue, S another) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        c.setWildcard(value);

    }


}

