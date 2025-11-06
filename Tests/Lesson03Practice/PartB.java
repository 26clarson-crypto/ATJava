/* Promtp the user for the sale amount in dollars
 * Calculate the tax amount
 * 5% tax for the first $100000
 * 7.5% tax for the amount over $100000 and up to $500000
 * 10% tax for any amount over $500000
 * Use basic input validation so the program will display an error message if the user enteres a non numerical number or a sales amount less than $0.
 */
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sale amount in dollars: ");
        if (scanner.hasNextDouble()) {
            double saleAmount = scanner.nextDouble();
            if (saleAmount >= 0) {
                double taxAmount = 0;
                if (saleAmount <= 100000) {
                    taxAmount = saleAmount * 0.05;
                } else if (saleAmount <= 500000) {
                    taxAmount = 100000 * 0.05 + (saleAmount - 100000) * 0.075;
                } else {
                    taxAmount = 100000 * 0.05 + 400000 * 0.075 + (saleAmount - 500000) * 0.1;
                }
                // format the values to 2 decimal places and align the zeros. 
                taxAmount = Math.round(taxAmount * 100.0) / 100.0;
                System.out.printf("Sales amount: $%.2f%n", saleAmount);
                System.out.printf("Tax amount: $%.2f%n", taxAmount);
            } else {
                System.err.println("Invalid sale amount. Sale amount must be a non-negative number.");
            }
        } else {
            System.err.println("Invalid input. Please enter a numerical value.");
        }
        scanner.close();
    }
}
