/* Write a Java program that prompts the user for a series of integer values:
Store the values in an ArrayList using the Integer wrapper class
User enters 'q' to quit inputting data
After you've acquired all the data, go through the list of numbers and remove every odd number from the ArrayList
Print out the modified list, one number per line

Test your code using the following sequence of integer values,
1, 1, 2, 3, 4, 5, 5, 6, 7, 8
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        // Loop to get numbers from the user
        while (true) {
            System.out.print("Enter an integer (or 'q' to quit): ");
            input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'q'.");
            }
        }

        // Remove odd numbers
        numbers.removeIf(n -> n % 2 != 0);

        // Print the modified list
        System.out.println("Modified list:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}