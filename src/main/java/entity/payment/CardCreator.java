package entity.payment;

import utils.MyMap;

public interface CardCreator {
    public Card create(MyMap transaction);
}
