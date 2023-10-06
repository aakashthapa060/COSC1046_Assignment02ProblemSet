import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("[\\s]+");
        System.out.print("Enter a point with two coordinates separated by a space: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        checkRectangle(x, y);
    }

    public static void checkRectangle(double x, double y) {
        double xAxis = Math.abs(x);
        double yAxis = Math.abs(y);

        if (xAxis <= 10 / 2 && yAxis <= 5 / 2) {
            System.out.println("Point (" + xAxis + ", " + yAxis + ") is in the rectangle");
        } else {
            System.out.println("Point (" + xAxis + ", " + yAxis + ") is not in the rectangle");
        }

    }
}