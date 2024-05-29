package entity.shipping;

import entity.order.Order;

public class NewShippingFee implements ShippingFeeStrategy {

    private static final int WEIGHT_FACTOR = 10;
    private static final int BULKINESS_FACTOR = 10;
    private static final int DISTANCE_FACTOR = 1;

    // Phương thức tính độ cồng kềnh của kiện hàng
    public int calculateBulkiness(int length, int width, int height) {
        return (length * width * height) / 6000;
    }

    // Phương thức tính khối lượng của kiện hàng
    public int calculateWeight(int length, int width, int height) {
        return (length * width * height) / 10000;
    }

    @Override
    public int calculate(Order order, int distance) {
        int bulkiness = calculateBulkiness(1, 2, 3);
        int weight = calculateWeight(1, 2, 3);
        return (weight * WEIGHT_FACTOR) + (bulkiness * BULKINESS_FACTOR) + (distance * DISTANCE_FACTOR);
    }
}
