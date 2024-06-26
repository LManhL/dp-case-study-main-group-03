package entity.shipping;

import entity.order.Order;
import org.example.AlternativeDistanceCalculator;
import org.example.DistanceCalculator;

public class DeliveryInfo {

    protected String name;
    protected String phone;
    protected String province;
    protected String address;
    protected String shippingInstructions;
    protected DistanceCalculator distanceCalculator;
    protected ShippingStrategy shippingStrategy;


    public DeliveryInfo(String name, String phone, String province, String address, String shippingInstructions, DistanceCalculator distanceCalculator) {
        this.name = name;
        this.phone = phone;
        this.province = province;
        this.address = address;
        this.shippingInstructions = shippingInstructions;
        this.distanceCalculator = distanceCalculator;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setDistanceCalculator(DistanceCalculator distanceCalculator) {
        this.distanceCalculator = distanceCalculator;
    }

    public int calculateShippingFee() {
        int distance = distanceCalculator.calculateDistance(address, province);
        return shippingStrategy.calculate(distance);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getProvince() {
        return province;
    }

    public String getAddress() {
        return address;
    }

    public String getShippingInstructions() {
        return shippingInstructions;
    }


}
