package javaPrac.inheritance;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();

        // inheritance.objectCast();   런타임 에러 발생!!
        inheritance.objectCast2();

        inheritance.objectCastArray();

    }

    public void objectCast() {

        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        ParentCasting parent2 = child;
        // ChildCasting child2 = (ChildCasting) parent; -- 런타임 오류 발생!!

    }

public void objectCast2() {

    ChildCasting child = new ChildCasting();
    ParentCasting parent2 = child;

    ChildCasting child2 = (ChildCasting) parent2;
}

public void objectCastArray(){
    ParentCasting[] parentArray = new ParentCasting[3];

    parentArray[0] = new ChildCasting();
    parentArray[1] = new ParentCasting();
    parentArray[2] = new ChildCasting();
    objectTypeCheck(parentArray);
}

    public void objectTypeCheck(ParentCasting[] parentArray) {
        for (ParentCasting tempParent : parentArray) {
            if (tempParent instanceof ChildCasting) { // 가장 하위에 있는 자식 타입 부터 먼저 체크해야함!!!
                System.out.println("Child Type");
                ChildCasting tempChild = (ChildCasting)tempParent;
                tempChild.printAge();
            } else if (tempParent instanceof ParentCasting) {
                System.out.println("Parnet Type");
                ParentCasting parent = tempParent;
                parent.printName();
            } else {
                System.out.println("Unknown Type");
            }
        }
    }
}
