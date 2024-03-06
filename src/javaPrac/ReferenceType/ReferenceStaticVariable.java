package javaPrac.ReferenceType;

public class ReferenceStaticVariable {
    static String name;

    public ReferenceStaticVariable() {
    }

    public ReferenceStaticVariable(String name) {
        this.name = name;
    }

    public void checkName() {
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("sungYoung");
        System.out.println(reference1.name);

        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("takYoung");
        System.out.println(reference1.name);
    }



    public static void main(String[] args) {
        ReferenceStaticVariable reference = new ReferenceStaticVariable();
        reference.checkName();
    }
}
