/* Chloe Larson
Part B
Lesson 19
I used the internet for help on the writing and the average math */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {

        try {
            // Open input and output files
            File inputFile = new File("quizzes.txt");
            Scanner input = new Scanner(inputFile);

            // used intenret specifically here to figure out how to write to a file
            PrintWriter output = new PrintWriter("quizzesMod.txt");

            int quizNumber = 0;
            double total = 0;
            int count = 0;

            // Read quiz scores
            while (input.hasNextDouble()) {
                double score = input.nextDouble();
                total += score;
                count++;

                // Write formatted quiz line
                output.printf("Quiz %03d: %6.2f%n", quizNumber, score);
                quizNumber++;
            }

            // Calculate average
            double average = total / count;

            // Write divider and average
            output.println("----------------");
            output.printf("Average:   %6.2f%n", average);

            // Close files
            input.close();
            output.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
