package javaPrac.defaultMethod;

public interface DefaultStaticMethod {
    static final String name = "GodOfJavaBook";
    static final int since = 2013;

    String getName();
    int getSince();
    
    default String getEmail() {
        return name + "@godogjava.com";
    }
}
