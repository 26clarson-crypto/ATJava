/* Chloe Larson
Part C
Lesson 18
Used the internet for help with not ending the loop if invalid input is given.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        ArrayList<Integer> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        // Loop to get temperatures from the user
        while (true) {
            System.out.print("Enter a temperature (or 'q' to quit): ");
            input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            try {
                int temp = Integer.parseInt(input);
                temperatures.add(temp);
                // error code
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'q'.");
            }
        }

        // Find the lowest temperature
        int lowestTemp = Integer.MAX_VALUE;
        for (Integer temp : temperatures) {
            if (temp < lowestTemp) {
                lowestTemp = temp;
            }
        }

        // Print each temperature and mark the lowest one
        System.out.println("Temperatures entered:");
        for (Integer temp : temperatures) {
            if (temp == lowestTemp) {
                System.out.println(temp + " <= lowest");
            } else {
                System.out.println(temp);
            }
        }

        scanner.close();
    }
}