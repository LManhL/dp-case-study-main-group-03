package entity.payment;

public class Card {
    protected String cardCode;
    protected String owner;
    protected String dateExpired;
    protected String type;

    public Card(String cardCode, String owner, String dateExpired){
        this.cardCode = cardCode;
        this.owner = owner;
        this.dateExpired = dateExpired;
    }

    public String getCardCode() {
        return cardCode;
    }

    public String getOwner() {
        return owner;
    }

    public String getDateExpired() {
        return dateExpired;
    }

    public String getType() {
        return type;
    }

}
