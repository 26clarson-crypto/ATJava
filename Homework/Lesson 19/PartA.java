/* Chloe Larson
Part A
Lesson 19
I used the internet and class materials to understand how to open a file since I missed the previous class */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {

        ArrayList<Integer> temps = new ArrayList<>();
        int lowest = Integer.MAX_VALUE;

        try {
            // Open the file
            File file = new File("temps.txt");
            Scanner input = new Scanner(file);

            // Read values into ArrayList and track lowest temp
            while (input.hasNextInt()) {
                int temp = input.nextInt();
                temps.add(temp);

                if (temp < lowest) {
                    lowest = temp;
                }
            }

            // Close the file
            input.close();

            // Print temperatures and mark lowest
            for (int temp : temps) {
                if (temp == lowest) {
                    System.out.println(temp + " <= lowest");
                } else {
                    System.out.println(temp);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
