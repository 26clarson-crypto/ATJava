/* Chloe Larson
 * Part B
 */
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the annual interest rate (APR) as a percentage: ");
        double interestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the initial balance amount in dollars: ");
        double initialBalance = scanner.nextDouble();

        System.out.printf("%-10s %-15s %-15s%n", "Year", "Interest", "Balance");
        System.out.println("-----------------------------------------");

        for (int year = 1; year <= 5; year++) {
            double interest = initialBalance * interestRate;
            initialBalance += interest;

            System.out.printf("%-10d %-15.2f %-15.2f%n", year, interest, initialBalance);
        }

        scanner.close();
    }
}
