package entity.shipping;

import entity.order.Order;

public class DefaultShippingFee implements ShippingFeeStrategy{
    @Override
    public int calculate(Order order, int distance) {
        return (int) (distance * 1.2);
    }
}
