import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a numerator: ");
        int numerator = input.nextInt();
        System.out.println("Enter a denominator: ");
        int denominator = input.nextInt();

        checkFraction(numerator, denominator);
    }

    public static void checkFraction(int numerator, int denominator) {
        int reducedValue = numerator / denominator;
        int fractionalNumerator = numerator % denominator;
        int Hcf = hcf(numerator, denominator);

        if (numerator < denominator) {
            System.out.println(numerator + "/" + denominator + " is a proper fraction ");
        } else if (fractionalNumerator == 0) {
            System.out.println(numerator + "/" + denominator + " is an improper fraction and it can be reduced to "
                    + reducedValue);
        } else {
            int modifiedNumerator = fractionalNumerator / Hcf;
            int modifiedDenominator = denominator / Hcf;

            System.out.print(numerator + "/" + denominator + " is an improper fraction and its mixed fraction is: ");
            if (modifiedNumerator == 0) {
                System.out.println(reducedValue);
            } else {
                System.out.println(reducedValue + " + " + modifiedNumerator + " / " + modifiedDenominator);
            }
        }

    }

    public static int hcf(int numerator, int denominator) {
        int hcf = 1;
        int getSmallerValue = Math.min(numerator, denominator);

        /*
         * we are using i = 2 because we cannot divide anything with 0 it will throw an
         * error,
         * and while we can use 1 yet it won't be effective because 1 can divide all
         * numbers
         */
        for (int i = 2; i <= getSmallerValue; ++i) {
            if (numerator % i == 0 && denominator % i == 0) {
                hcf = i;
            }
        }

        return hcf;
    }
}