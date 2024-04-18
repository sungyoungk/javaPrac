package javaPrac.lang;

public class JavaLangSystem {
    public static void main(String[] args) {
        JavaLangSystem sample = new JavaLangSystem();
        sample.systempropertiescheck();
    }

    public void systempropertiescheck() {
        System.out.println("java.version = " + System.getProperty("java.version"));
        System.out.println("kestSet = " + System.getProperties());
        System.out.println("JAVA_HOME= " + System.getenv("JAVA_HOME"));

    }


}
