package entity.payment;

/**
 * @author
 */
// Concrete Product
public class CreditCard extends Card {

    protected int cvvCode;

    public CreditCard(String cardCode, String owner, String dateExpired, int cvvCode) {
        this.cardCode = cardCode;
        this.owner = owner;
        this.dateExpired = dateExpired;
        this.cvvCode = cvvCode;
        this.type = CardType.CREDIT_CARD;
    }
}
