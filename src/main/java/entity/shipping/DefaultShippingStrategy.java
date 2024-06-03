package entity.shipping;

public class DefaultShippingStrategy implements ShippingStrategy{
    @Override
    public int calculate(int distance) {
        return (int)(distance * 1.2);}}
