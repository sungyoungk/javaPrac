package javaPrac.ReferenceType;

public class StaticBlock {
    static int data = 1;

    public StaticBlock() {
        System.out.println("Static Block Constructor");
    }

    static {
        System.out.println("*** First static block ***");
        data = 3;
    }

    static {
        System.out.println("*** Second static block ***");
        data = 5;
    }

    public static int getData(){
        return data;
    }

    public void makeStaticBlockWithData(){
        System.out.println("data = " + StaticBlock.getData());
        StaticBlock block1 = new StaticBlock();

        block1.data = 1;
        System.out.println("---------------");

        StaticBlock block2 = new StaticBlock();
        block2.data = 2;
        System.out.println("data = " + StaticBlock.getData());
    }

    public static void main(String[] args) {
        StaticBlock test = new StaticBlock();
        test.makeStaticBlockWithData();
    }
}
