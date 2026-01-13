/* Chloe Larson
Part A
Used the internet to help with sorting an array and printing in reverse order
 */

import java.util.Arrays;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[10];
        int currentSize = 0;

        System.out.println("Enter up to 10 integer values (type 'q' to quit):");

        while (currentSize < values.length) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                values[currentSize] = Integer.parseInt(input);
                currentSize++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }

        // Print elements with asterisks
        System.out.print("*");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i] + "*");
        }
        System.out.println();

        // Sort the valid portion of the array
        Arrays.sort(values, 0, currentSize);

        // Print elements in reverse order separated by commas
        for (int i = currentSize - 1; i >= 0; i--) {
            System.out.print(values[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        scanner.close();
    }
}

