package entity.payment;

import utils.MyMap;

public class DomesticCardCreator implements CardCreator{
    @Override
    public Card create(MyMap transaction) {
        CreditCard card = new CreditCard(
                (String) transaction.get("cardCode"),
                (String) transaction.get("owner"),
                (String) transaction.get("dateExpired"),
                Integer.parseInt((String) transaction.get("cvvCode")));
        return card;
    }
}
