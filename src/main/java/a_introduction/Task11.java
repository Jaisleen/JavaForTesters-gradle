package a_introduction;

public class Task11 {
    public static boolean validateSumWithDiscount(int pcs, double price, double discount, double expectedSum) {
        double total = pcs * price;
        double discountedTotal = total * (1 - discount / 100);
        double roundedDiscountedTotal = Math.round(discountedTotal * 100.0) / 100.0;
        double roundedExpectedSum = Math.round(expectedSum * 100.0) / 100.0;
        return roundedDiscountedTotal == roundedExpectedSum;

    }
    public static void main(String[] args) {
        int pcs = 10;
        double price = 5.5;
        double discount = 10;
        double expectedSum = 49.50;
        boolean result = validateSumWithDiscount(pcs, price, discount, expectedSum);
        System.out.println(result);
    }
}
