package javaPrac.ReferenceType;

public class MethodVarargs {
    public static void main(String[] args) {
        MethodVarargs varargs = new MethodVarargs();
        varargs.calculateNumberWithArray(new int[]{1,2,3,4,5});
        varargs.calculateNumbers(1,2,3,4,5);


        MemberDTO member = new MemberDTO("Sung Young", "010-3643-0446", "skim@gmail.com");

        System.out.printf("name:%s phone:%s E-Main:%s\n", member.name, member.phone, member.email);
        System.out.printf("이름은 %s 이고, 휴대폰 번호는 %s 이고, 이메일 주소는 %s 입니다\n", member.name, member.phone, member.email);


    }
    public void calculateNumberWithArray(int[] numbers) {

    }

    public void calculateNumbers(int... numbers) {

    }
}
