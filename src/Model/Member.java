package Model;

public class Member extends User{
    MemberShipCard membership;

    public Member(String id,String memberCard) {
        super(id);
        membership=new MemberShipCard(memberCard);
        
    }
    public Member(String fullName,String email,String address,String memberCard) {
        super(fullName, email, address);
        membership=new MemberShipCard(memberCard);
    }

    public MemberShipCard getMemberCard() {
        return membership;
    }   
}