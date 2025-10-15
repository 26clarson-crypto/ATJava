import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner input = new Scanner(System.in);

        // Declare constants
        final double PIE_PRICE = 10.00;
        final double DISCOUNT_RATE = 0.10;
        final int DISCOUNT_THRESHOLD = 3;

        // Prompt user for number of pies
        System.out.print("Enter the number of pies you would like to buy: ");
        int pies = input.nextInt();

        // Calculate total cost before discount
        double totalCost = pies * PIE_PRICE;

        // Apply discount if applicable
        if (pies >= DISCOUNT_THRESHOLD) {
            double discount = totalCost * DISCOUNT_RATE;
            totalCost -= discount;
            System.out.printf("You qualify for a 10%% discount! You save $%.2f.%n", discount);
        }

        // Display final total
        System.out.printf("Your total cost is: $%.2f%n", totalCost);

        // Close the scanner
        input.close();
    }
}