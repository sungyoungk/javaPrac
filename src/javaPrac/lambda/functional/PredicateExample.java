package javaPrac.lambda.functional;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        PredicateExample predicateExample = new PredicateExample();

        Predicate<String> predicateLength5 = (a) -> a.length() > 5;
        Predicate<String> predicateContains = (a) -> a.contains("God");
        Predicate<String> predicateStart = (a) -> a.startsWith("God");

        String godOfJava = "GodOfJava";
        String goodJava = "GoodJava";

        predicateExample.predicateTest(predicateLength5, godOfJava);
        predicateExample.predicateTest(predicateLength5, goodJava);

        predicateExample.predicateNegate(predicateLength5, godOfJava);
        predicateExample.predicateNegate(predicateLength5, godOfJava);

        predicateExample.predicateAnd(predicateLength5, predicateStart, godOfJava);
        predicateExample.predicateAnd(predicateLength5, predicateStart, goodJava);

        predicateExample.predicateOr(predicateLength5, predicateStart, godOfJava);
        predicateExample.predicateOr(predicateLength5, predicateStart, goodJava);

    }

    public void predicateTest(Predicate<String> p, String data) {
        System.out.println(p.test(data));
    }

    public void predicateAnd(Predicate<String> p1, Predicate<String> p2, String data) {
        System.out.println(p1.and(p2).test(data));
    }

    public void predicateOr(Predicate<String> p1, Predicate<String> p2, String data) {
        System.out.println(p1.or(p2).test(data));
    }

    public void predicateNegate(Predicate<String> p, String data) {
        System.out.println(p.negate().test(data));

    }







}
