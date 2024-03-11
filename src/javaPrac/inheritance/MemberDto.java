package javaPrac.inheritance;

import javaPrac.ReferenceType.MemberDTO;

public class MemberDto {
    public String name;
    public String phone;
    public String email;

    public MemberDto(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;

        MemberDTO other = (MemberDTO) obj;

        if (name == null) {
            if (other.name != null) return false;
        } else if (!email.equals(other.email)) return false;

        if (phone == null) {
            if (other.phone != null) return false;
        }
        return true;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }

}
