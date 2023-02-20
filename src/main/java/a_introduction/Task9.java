package a_introduction;

public class Task9 {
    public static double minFrom(double a, double b, double c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        double a = 5.6;
        double b = 2.1;
        double c = 3.7;

        double lowest = minFrom(a, b, c);
        System.out.println("The lowest number is: " + lowest);
    }
}