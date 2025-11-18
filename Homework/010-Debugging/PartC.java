import java.util.Scanner;

/*
 * Chloe Larson
 * Part C
 */
public class PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for name.
        System.out.print("Enter student name: ");
        String name = in.nextLine();

        // Initialize variables.
        int total = 0;
        int min = Integer.MAX_VALUE;  // Proper initialization
        int max = Integer.MIN_VALUE;  // Proper initialization
        final int COUNT = 4;

        // Loop to obtain test scores.
        for (int i = 1; i <= COUNT; i++) {
            System.out.print("Enter score " + i + " (0-100): ");
            int s = in.nextInt();

            // Validate the score.
            if (s < 0) {
                s = 0;
            } else if (s > 100) {
                s = 100;
            }

            // Track min and max.
            if (s < min) {
                min = s;
            }
            if (s > max) {
                max = s;
            }

            total += s;
        }

        // Calculate average correctly (avoid integer division).
        double avg = (double) total / COUNT;

        // Determine pass/fail.
        boolean passed = avg >= 60;

        // Assign letter grade.
        char letter;
        if (avg >= 90) {
            letter = 'A';
        } else if (avg >= 80) {
            letter = 'B';
        } else if (avg >= 70) {
            letter = 'C';
        } else if (avg >= 60) {
            letter = 'D';
        } else {
            letter = 'F';
        }

        // Print summary.
        System.out.println("\n----- Report -----");
        System.out.println("Name: " + name);
        System.out.println("Highest single score recorded: " + max);
        System.out.println("Lowest single score recorded: " + min);
        System.out.println("Passed? " + passed);
        System.out.printf("Average: %.2f\n", avg);
        System.out.println("Letter grade: " + letter);

        in.close();
    }
}


// multiple errors: min and max were not initialized properly, average calculation was using integer division, letter grade conditions were incorrect