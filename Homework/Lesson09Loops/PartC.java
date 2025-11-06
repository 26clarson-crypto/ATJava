/* Chloe Larson
Part C
Lesson 09 - Loops
 */

import java.util.Random;
public class PartC {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int iterations = 10; 

        for (int i = 0; i < iterations; i++) {
            int randomNumber = random.nextInt(10) + 1; // Generates a number between 1 and 10
            sum += randomNumber;
        }

        double average = (double) sum / iterations;
        System.out.println("Average of " + iterations + " random integers: " + average);
    }
}