package javaPrac.generic;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();


    }

public void callWildCardMethod() {
    WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
    wildcard.setWildcard("A");
    wildcardStringMethod(wildcard);
}

    public void wildcardStringMethod(WildcardGeneric<?> c) {
        Object value = c.getWildcard();
        if (c.getWildcard() instanceof String)  System.out.println(value);

    }
}
