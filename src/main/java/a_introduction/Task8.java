package a_introduction;

public class Task8 {

    public static double calculatePrice(int price, double discount) {
        double discountAmount = price * discount / 100.0;
        return price - discountAmount;
    }

    public static void main(String[] args) {
        int price = 100;
        double discount = 20.0;
        System.out.println("Price after discount: " + calculatePrice(price, discount));
    }

}
