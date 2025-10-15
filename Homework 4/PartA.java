/* Chloe Larson
 * Homework 04
 * Part B
 * Asks for an account ID and the account balance for 3 users
 * Account ID ranges from 1 to 99999
 * Account balances range from $0.01 to $999,999,999.99
 * Displays the account ID and balance
 * Pad ID"s with zeros
 * Print out account balances to two decimal places
 * Print out account balances so they are aligned the same from row to row. 
 */
import java.util.Scanner;

public class PartA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask for account ID and balance for user 1
        System.out.println("Enter account ID (1 to 99999): ");
        int AccountID1 = input.nextInt();
        System.out.println("Enter account balance (0.01 to 999999999.99): ");
        double AccountBalance1 = input.nextDouble();
        //Ask for account ID and balance for user 2
        System.out.println("Enter account ID (1 to 99999): ");
        int AccountID2 = input.nextInt();
        System.out.println("Enter account balance (0.01 to 999999999.99): ");
        double AccountBalance2 = input.nextDouble();
        //Ask for account ID and balance for user 3
        System.out.println("Enter account ID (1 to 99999): ");
        int AccountID3 = input.nextInt();
        System.out.println("Enter account balance (0.01 to 999999999.99): ");
        double AccountBalance3 = input.nextDouble();
        //Display account ID and balance for user 1

    System.out.printf("Account ID 1: %06d Balance: $%,13.2f\n", AccountID1, AccountBalance1);
        //Display account ID and balance for user 2
    System.out.printf("Account ID 2: %06d Balance: $%,13.2f\n", AccountID2, AccountBalance2);
        //Display account ID and balance for user 3
    System.out.printf("Account ID 3: %06d Balance: $%,13.2f\n", AccountID3, AccountBalance3);
    }
}
