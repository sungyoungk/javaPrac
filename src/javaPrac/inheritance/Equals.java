package javaPrac.inheritance;

import javaPrac.ReferenceType.MemberDTO;

import java.lang.reflect.Member;

public class Equals {
    public static void main(String[] args) {
        Equals equals = new Equals();
        equals.equalMethod2();
    }

    public void equalMethod() {
        MemberDTO obj1 = new MemberDTO("Sung Young Kim");
        MemberDTO obj2 = new MemberDTO("Sung Young Kim");

        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("two are different");
        }
    }

    public void equalMethod2() {
        MemberDTO obj1 = new MemberDTO("Sung Young Kim");
        MemberDTO obj2 = new MemberDTO("Sung Young Kim");

        if (obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("two are different");
        }
    }


}
