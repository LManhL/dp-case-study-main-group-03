package entity.order;

import utils.Utils;

import java.util.logging.Logger;

public class CanceledState extends OrderState {

    private static Logger LOGGER = Utils.getLogger(CanceledState.class.getName());

    public CanceledState(Order order) {
        super(order);
    }

    @Override
    void cancel() {
        LOGGER.info("Order has been canceled!");
    }

    @Override
    void confirm() {
        LOGGER.info("Order has been canceled!");
    }
}
