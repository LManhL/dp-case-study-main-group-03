package entity.payment;

public class DomesticCard extends Card{
    private String issueBank;

    public DomesticCard(String cardCode, String owner, String dateExpired, String issueBank) {
        this.cardCode = cardCode;
        this.owner = owner;
        this.dateExpired = dateExpired;
        this.issueBank = issueBank;
        this.type = CardType.DOMESTIC_CARD;
    }
}
