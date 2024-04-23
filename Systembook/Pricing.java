package Systembook;

public class Pricing {

    private static final double BASE_PRICE = 100.00;

    public static double calculatePrice(int seatNumber) {
        if (seatNumber % 3 == 0) {
            return BASE_PRICE * 1.30;
        }
        return BASE_PRICE;
    }
}
