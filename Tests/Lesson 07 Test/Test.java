/* Chloe Larson
07 Test - Part A
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            // open file for reading 
            File file = new File("mathmeet.txt");
            Scanner scanner = new Scanner(file);
            
            // format the output 
            System.out.printf("%-20s | %-20s  | %-10s%n", "Name", "School", "Score");
            System.out.println("--------------------------------------------------");
            
            // set to 0 for calculations
            double totalScore = 0;
            int count = 0;
            
            // loop through file.
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(", ");
                // seperate data
                
                String name = parts[0];
                String school = parts[1];
                double score = Double.parseDouble(parts[2]);
                
                // print out data (formatted) 
                System.out.printf("%-20s | %-20s | %-10.1f%n ", name, school, score);
                
                totalScore += score;
                count++;
            }
            
            // calculate average score and print it out.
            double averageScore = totalScore / count;
            System.out.println("--------------------------------------------------");
            System.out.printf("Average Score: %.2f%n", averageScore);
            
            scanner.close(); // close scanner to avoid messing with the file.
            // FileNotFoundException is used below to avoid a crash if file is not found. 
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage()); // error message
        }
    }
}