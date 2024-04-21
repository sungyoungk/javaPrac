package javaPrac.generic;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();

    }

    public void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildStringMethod(wildcard);
        wildcardPramMethod(wildcard);
    }

    public void wildStringMethod(WildcardGeneric<String> c) {
        String value = c.getWildcard();
        System.out.println(value);
    }

    public void wildcardPramMethod(WildcardGeneric<?> c) {
        Object value = c.getWildcard();
        if (value instanceof String) {
            System.out.println(value);
        }
    }
}
