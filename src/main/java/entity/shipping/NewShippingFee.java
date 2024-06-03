package entity.shipping;

import entity.order.Order;

public class NewShippingFee implements ShippingFeeStrategy {

    private double length;
    private double width;
    private double height;

    public NewShippingFee(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    private static final int WEIGHT_FACTOR = 10;
    private static final int BULKINESS_FACTOR = 10;
    private static final int DISTANCE_FACTOR = 1;

    // Phương thức tính độ cồng kềnh của kiện hàng
    public double calculateBulkiness() {
        return (length * width * height) / 6000;
    }

    // Phương thức tính khối lượng của kiện hàng
    public double calculateWeight() {
        return (length * width * height) / 10000;
    }

    @Override public int calculate(int distance) {
        double bulkiness = calculateBulkiness();
        double weight = calculateWeight();
        return (int)((weight * WEIGHT_FACTOR) + (bulkiness * BULKINESS_FACTOR) + (distance * DISTANCE_FACTOR));
    }
}
