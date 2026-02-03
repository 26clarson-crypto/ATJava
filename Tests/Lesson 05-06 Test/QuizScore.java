/* Chloe Larson
05 - 06 Test */

import java.util.ArrayList;
import java.util.Scanner;

public class QuizScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> quizScores = new ArrayList<>();
        String input;
// create array and ask user for input
        System.out.println("Enter quiz scores (or 'q' to quit):");

// get elements for the array, and test whether user wants to quit or not
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                double score = Double.parseDouble(input);
                quizScores.add(score);
                // check integer values to make sure they dont exceed 100 or go below 0
                if (score < 0 || score > 100) {
                    System.out.println("Please enter a score between 0 and 100.");
                    quizScores.remove(quizScores.size() - 1);
                }
                // Make sure they are integer values
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid quiz score or 'q' to quit.");
            }
        }
// print out total quiz scores and average

        System.out.println("--------------------");
        System.out.println("Quiz Scores:");
        System.out.println("--------------------");
        double total = 0.0;
// format the output to two decimal places
        for (double score : quizScores) {
            System.out.printf("%10.2f%n", score);
            total += score;
        }
// calculate and display average, and if there were no quiz scores entered print that message
        if (!quizScores.isEmpty()) {
            double average = total / quizScores.size();
            System.out.println("--------------------");
            System.out.printf("Average Score: %.2f%n", average);
        } else {
            System.out.println("No quiz scores entered.");
        }

        scanner.close();
    }
}