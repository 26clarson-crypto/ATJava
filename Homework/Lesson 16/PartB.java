/* Chloe Larson
Part B 
Used the internet barely for help on the math and how to code that format. */

import java.util.Arrays;
public class PartB {
    public static void main(String[] args) {
        // Test case 1
        double avg1 = average(10, 8, 9);
        System.out.println("Average of (10, 8, 9): " + avg1);
        
        // Test case 2
        double[] scores = {100, 90, 80, 100, 80};
        double avg2 = average(scores);
        System.out.println("Average of scores array: " + avg2);
    }

    public static double average(double ... values) {
        if (values.length == 0) {
            return 0; // Avoid division by zero
        }
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}
