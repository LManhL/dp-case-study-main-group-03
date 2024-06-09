package entity.order;

public class PendingState extends OrderState {

    public PendingState(Order order) {
        super(order);
    }

    @Override
    public void cancel() {
        getOrder().refund();
        getOrder().changeState(new CanceledState(getOrder()));
    }

    @Override
    public void confirm() {
        getOrder().changeState(new AcceptedState(getOrder()));
    }
}
