package Model;

public class MemberShipCard {
    private int cardNumber;
    private String expireDate;

    public MemberShipCard(int cardNumber, String expireDate) {
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }
}
