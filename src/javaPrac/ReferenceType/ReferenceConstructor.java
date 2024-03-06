package javaPrac.ReferenceType;

import java.lang.reflect.Member;

public class ReferenceConstructor {
    public static void main(String[] args) {
    ReferenceConstructor reference = new ReferenceConstructor();
    reference.makeMemberObject();
    }

    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("sungyoung");
        MemberDTO dto3 = new MemberDTO("sungyoung", "01036430446");
        MemberDTO dto4 = new MemberDTO("sungyoung", "01036430446", "google@gmail.com");
    }
}
