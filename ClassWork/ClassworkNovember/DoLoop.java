

import java.util.Scanner;
public class DoLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDollars = 0;
        int amount;
// take input with a (.) to take cents into account
        do {
            System.out.print("Enter a positive dollar amount (negative to quit): ");
            amount = scanner.nextInt();

            if (amount >= 0) {
                totalDollars += amount;
            }
        } while (amount >= 0);

        int dollars = totalDollars;
        int cents = (totalDollars - dollars) * 100;

        System.out.printf("Total amount entered: $%d.%02d%n", dollars, cents);
        scanner.close();
    }
}