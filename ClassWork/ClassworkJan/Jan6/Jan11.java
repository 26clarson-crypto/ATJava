/* Chloe Larson
Jan 11
Classwork - Coding Challenge (Modified)
*/

import java.util.Scanner;

public class Jan11 {

    // removing method code 
    public static int remove(double[] array, int currentSize, int targetIndex) {
        // check if targetIndex is valid
        if (targetIndex < 0 || targetIndex >= currentSize) {
            return currentSize;
        }

        // shift elements left to preserve order
        for (int i = targetIndex; i < currentSize - 1; i++) {
            array[i] = array[i + 1];
        }

        return currentSize - 1;
    }

    // inserting method code here
    public static int insert(double[] array, int currentSize, int targetIndex, double newElement) {
        // check if there is space and index is valid
        if (currentSize >= array.length || targetIndex < 0 || targetIndex > currentSize) {
            return currentSize;
        }

        // shift elements right to preserve order
        for (int i = currentSize; i > targetIndex; i--) {
            array[i] = array[i - 1];
        }

        array[targetIndex] = newElement;
        return currentSize + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_SCORES = 10;

        double[] scores = new double[MAX_SCORES];
        int count = 0;
        double sum = 0;
        double maxScore = Double.MIN_VALUE;

        System.out.println("Enter up to " + MAX_SCORES + " test scores (or 'Q' to quit):");

        while (count < MAX_SCORES) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double score = Double.parseDouble(input);
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
            double average = sum / count;

            System.out.println("\nOriginal Scores:");
            for (int i = 0; i < count; i++) {
                System.out.print(scores[i] + " ");
            }

            System.out.printf("\nAverage score: %.2f%n", average);
            System.out.println("Maximum score: " + maxScore);

            // DEMONSTRATE REMOVE
            count = remove(scores, count, 1);
            System.out.println("\nAfter removing index 1:");
            for (int i = 0; i < count; i++) {
                System.out.print(scores[i] + " ");
            }

            // DEMONSTRATE INSERT
            count = insert(scores, count, 1, 99.5);
            System.out.println("\nAfter inserting 99.5 at index 1:");
            for (int i = 0; i < count; i++) {
                System.out.print(scores[i] + " ");
            }

        } else {
            System.out.println("No test scores were entered.");
        }

        scanner.close();
    }
}
