/* Chloe Larson
Problem 4
I used the internet to understand how to show the progress bar and calculate the percentage
*/ 

import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value from 0 to 20: ");
        int value = in.nextInt();

        // Keep value in valid range
        if (value < 0) value = 0;
        if (value > 20) value = 20;

        System.out.print("Progress: [");

        // Print the # marks
        for (int i = 0; i < value; i++) {
            System.out.print("#");
        }

        // Print the - marks
        for (int i = value; i < 20; i++) {
            System.out.print("-");
        }

        System.out.print("] ");

        // Calculate percent
        int percent = (int)((value / 20.0) * 100);

        System.out.println(percent + "%");
    }
}
