package javaPrac.service;

import javaPrac.model.MemberDTO;

public class MemberManagerIkmpl2 extends MemberManagerAbstract{
    @Override
    public boolean addMember(MemberDTO member) {
        return false;
    }

    @Override
    public boolean removeMember(String name, String phone) {
        return false;
    }

    @Override
    public boolean updateMember(MemberDTO member) {
        return false;
    }
}
