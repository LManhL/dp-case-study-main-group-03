package entity.payment;

public class DomesticCard extends Card{

    protected String issuingBank;

    public DomesticCard(String cardCode, String owner, String dateExpired, String issuingBank){
        super(cardCode, owner, dateExpired);
        this.issuingBank = issuingBank;
        this.type = "DomesticCard";
    }
}
