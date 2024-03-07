package javaPrac.javapackage.sub;

public class AcessCall {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();
        accessModifier.protectedMethod();
        accessModifier.packagePrivateMethod();
        // accessModifier.privateMethod();
    }
}
