/* Chloe Larson
Jan 6
Classwork - Coding Challenge 
Used the internet for help on the MAX_SCORES variable and also how to use the while/try loop*/

import java.util.Scanner;

public class Jan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_SCORES = 10;
        // make sure there is a max of 10 scores
        int[] scores = new int[MAX_SCORES];
        int count = 0;
        int sum = 0;
        int maxScore = Integer.MIN_VALUE;
        // to track max value

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
                    // find the max value
                }
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid test score or 'Q' to quit.");
                // error message for invalid input
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            // calculate average
            System.out.println("Number of test scores entered: " + count);
            System.out.printf("Average score: %.2f%n", average);
            System.out.println("Maximum score: " + maxScore);
        } else {
            System.out.println("No test scores were entered.");
        }

        scanner.close();
    }
}