package javaPrac.ReferenceType;

public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        check.makeStaticBlockObject();
    }

    public void makeStaticBlockObject() {
        System.out.println("create block 1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Clreated block1");

        System.out.println("---------------");
        System.out.println("Create block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("created block2");
    }


}
