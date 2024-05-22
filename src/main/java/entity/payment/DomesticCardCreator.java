package entity.payment;


//ConcreteCreator
public class DomesticCardCreator implements CardCreator{
    private String cardCode;
    private String dateExpired;
    private String owner;
    private String issueBank;

    public DomesticCardCreator(String cardCode, String dateExpired, String owner, String issueBank) {
        this.cardCode = cardCode;
        this.dateExpired = dateExpired;
        this.owner = owner;
        this.issueBank = issueBank;
    }

    @Override
    public Card createCard() {
        return new DomesticCard(cardCode,owner,dateExpired,issueBank);
    }
}
