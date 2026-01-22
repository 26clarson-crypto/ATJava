/* Chloe Larson
Part D
Lesson 18
Used the internet for help with removing odd numbers from the list and not ending the loop if invalid input is given.
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