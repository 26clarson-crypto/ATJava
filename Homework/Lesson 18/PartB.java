/* Chloe Larson
Part B
Lesson 18
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        // Loop to get scores from the user
        while (true) {
            System.out.print("Enter a test score (or 'q' to quit): ");
            input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            try {
                double score = Double.parseDouble(input);
                scores.add(score);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'q'.");
            }
        }

        // Print each score with 2 decimal places
        System.out.println("Test scores entered:");
        for (Double score : scores) {
            System.out.printf("%.2f%n", score);
        }

        // Calculate and display the average
        if (!scores.isEmpty()) {
            double sum = 0;
            for (Double score : scores) {
                sum += score;
            }
            double average = sum / scores.size();
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("No scores entered.");
        }

        scanner.close();
    }
}