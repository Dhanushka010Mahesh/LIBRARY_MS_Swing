package Model;

public class MemberShipCard {
    private String cardNumber;
    private String registerDate;

    public MemberShipCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    public void setRegisterDate(String date){
        this.registerDate=date;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getRegisterDate() {
        return registerDate;
    }
}
