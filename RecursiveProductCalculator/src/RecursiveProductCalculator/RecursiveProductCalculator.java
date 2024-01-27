package RecursiveProductCalculator;

import java.util.Scanner;

public class RecursiveProductCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];

        // Get input from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Calculate the product using recursion
        double product = calculateProduct(numbers, 0);

        // Display the result
        System.out.println("The product of the entered numbers is: " + product);

        // Close the scanner
        scanner.close();
    }

    // Recursive method to calculate the product of an array of numbers
    private static double calculateProduct(double[] numbers, int index) {
        if (index == numbers.length) {
            return 1; // Base case: product of an empty array is 1
        } else {
            return numbers[index] * calculateProduct(numbers, index + 1);
        }
    }
}
