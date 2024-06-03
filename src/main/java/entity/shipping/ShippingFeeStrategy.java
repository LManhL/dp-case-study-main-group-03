package entity.shipping;

import entity.order.Order;

public interface ShippingFeeStrategy {
    // Thay đổi cách thực hiện tại runtime
    // Có nhiều hành vi và mỗi hành vi có cách thể hiện khác nhau
    int calculate(int distance);
}
