package entity.shipping;

import java.util.Random;

public class AlternativeDistanceCalculator {
    private static Random rand = new Random();

    public AlternativeDistanceCalculator() {
    }

    public int calculateDistance(String fullAddress) {
        return fullAddress.length();
    }
}
