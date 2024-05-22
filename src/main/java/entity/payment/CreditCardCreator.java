package entity.payment;


public class CreditCardCreator implements CardCreator{
    private String cardCode;
    private String dateExpired;
    private String owner;
    private Integer cvv;

    public CreditCardCreator(String cardCode, String dateExpired, String owner, Integer cvv) {
        this.cardCode = cardCode;
        this.dateExpired = dateExpired;
        this.owner = owner;
        this.cvv = cvv;
    }

    @Override
    public Card createCard() {
        return new CreditCard(cardCode,dateExpired,owner,cvv);
    }
}
