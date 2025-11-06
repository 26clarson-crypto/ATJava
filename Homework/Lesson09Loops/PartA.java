/* Chloe Larson
Part A 
Lesson 09 - Loops
 */

import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int count = 0;

        System.out.println("Enter test scores (negative value to end):");

        while (true) {
            double score = scanner.nextDouble();
            if (score < 0) {
                break;
            }
            total += score;
            count++;
        }

        if (count > 0) {
            double average = total / count;
            System.out.println("Number of scores entered: " + count);
            System.out.println("Average test score: " + average);
        } else {
            System.out.println("No valid scores entered.");
        }
    }
}
