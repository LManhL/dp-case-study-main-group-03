package entity.shipping;

import org.example.AlternativeDistanceCalculator;
import org.example.DistanceCalculator;

public class DistanceCalculatorAdapter extends DistanceCalculator {

    private AlternativeDistanceCalculator adaptee;

    public DistanceCalculatorAdapter(){
        adaptee = new AlternativeDistanceCalculator();
    }

    @Override
    public int calculateDistance(String address, String province) {
        String fullAddress = address + province;
        return adaptee.calculateDistance(fullAddress);
    }
}
