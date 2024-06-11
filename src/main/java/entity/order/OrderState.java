package entity.order;

abstract class OrderState {
    private Order order;

    protected OrderState(Order order){
        this.order = order;
    }

    abstract void cancel();

    abstract void confirm();

    public Order getOrder() {
        return order;
    }
}
