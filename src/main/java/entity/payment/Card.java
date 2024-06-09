package entity.payment;

public class Card {
    protected String cardCode;
    protected String owner;
    protected String dateExpired;
    protected CardType type;

    public Card(String cardCode, String owner, String dateExpired){
        this.cardCode = cardCode;
        this.owner = owner;
        this.dateExpired = dateExpired;
    }
}
