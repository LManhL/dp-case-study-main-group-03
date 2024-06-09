package entity.order;

import utils.Utils;

import java.util.logging.Logger;

public class DraftState extends OrderState {

    private static Logger LOGGER = Utils.getLogger(DraftState.class.getName());

    public DraftState(Order order) {
        super(order);
    }

    @Override
    void cancel() {
        LOGGER.info("Order hasn't created yet!");
    }

    @Override
    void confirm() {
        getOrder().changeState(new PendingState(getOrder()));
    }
}
