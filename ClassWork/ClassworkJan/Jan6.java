/* store up to 10 test scores in an array
use Q to quit entering data
Dont overflow the array
calculate the aerage when done
track the max value
print how many test scores there were
print the average 
print the max value */

import java.util.Scanner;

public class Jan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_SCORES = 10;
        int[] scores = new int[MAX_SCORES];
        int count = 0;
        int sum = 0;
        int maxScore = Integer.MIN_VALUE;

        System.out.println("Enter up to " + MAX_SCORES + " test scores (or 'Q' to quit):");

        while (count < MAX_SCORES) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) {
                break;
            }
            try {
                int score = Integer.parseInt(input);
                scores[count] = score;
                sum += score;
                if (score > maxScore) {
                    maxScore = score;
                }
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid test score or 'Q' to quit.");
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Number of test scores entered: " + count);
            System.out.printf("Average score: %.2f%n", average);
            System.out.println("Maximum score: " + maxScore);
        } else {
            System.out.println("No test scores were entered.");
        }

        scanner.close();
    }
}