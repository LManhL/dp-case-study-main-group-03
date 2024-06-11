package entity.order;

import utils.Utils;

import java.util.logging.Logger;

public class AcceptedState extends OrderState{

    private static Logger LOGGER = Utils.getLogger(AcceptedState.class.getName());

    public AcceptedState(Order order) {
        super(order);
    }

    @Override
    void cancel() {
        LOGGER.info("Can't cancel order!");
    }

    @Override
    void confirm() {
        LOGGER.info("Order's already been accepted!");
    }
}
