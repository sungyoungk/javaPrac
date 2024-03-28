package javaPrac.util;


import javaPrac.model.MemberDTO;

public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();

    public static void main(String[] args) {

    }

    public void checkDTO(){
        System.out.println(dto);
        // dto = new MemberDTO(); // final 로 선언되었기 때문에 에러!!
        dto.name = "sung young"; // 해당 객체가 final 이라고 해서 객체의 인스턴스 변수까지 final인것은 아님!!!
    }
}
