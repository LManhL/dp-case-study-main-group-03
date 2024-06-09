package entity.payment;

/**
 * @author
 */
public class CreditCard extends Card {


    protected int cvvCode;

    public CreditCard(String cardCode, String owner, String dateExpired, int cvvCode) {
        super(cardCode, owner, dateExpired);
        this.cvvCode = cvvCode;
        this.type = "CreditCard";
    }
}
