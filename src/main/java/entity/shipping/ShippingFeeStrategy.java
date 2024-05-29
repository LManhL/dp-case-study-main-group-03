package entity.shipping;

import entity.order.Order;

public interface ShippingFeeStrategy {
    int calculate(Order order, int distance);
}
