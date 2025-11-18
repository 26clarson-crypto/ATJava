/* Chloe Larson
 * Homework 03 - Variables & Operators
 * Create a program that calculates how many quarters, dimes, nickels, and pennies are in a given amount of money
 */
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        // Given amount of money in cents
        // Ask user to input an amount in cents
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount in cents: ");
        int amount = scanner.nextInt();

        // Calculate the number of each coin
        int quarters = amount / 25;
        amount %= 25;
        int dimes = amount / 10;
        amount %= 10;
        int nickels = amount / 5;
        amount %= 5;
        int pennies = amount;

        // Display the results
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

        scanner.close();
    }
}
