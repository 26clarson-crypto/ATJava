/* Chloe Larson
Part A 
Used the internet for help on parsing integers and formating output. 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        String filePath = "Top5Unemployment.txt"; 

        System.out.println("---------------------------------------------------------------");
        System.out.println("                   Top 5 Unemployment Rates");
        System.out.println("---------------------------------------------------------------");

        try (Scanner scanner = new Scanner(new File(filePath))) {
            int count = 0;
            while (scanner.hasNextLine() && count < 5) {
                String line = scanner.nextLine();
                // delimeter is a comma
                String[] parts = line.split(",");

                String country = parts[0].trim();
                double unemploymentRate = Double.parseDouble(parts[1].trim());
                int ranking = Integer.parseInt(parts[2].trim());
                String region = parts[3].trim();
// formatting the output
                System.out.printf("Ranked # %2d: %-15s | %6.2f%% | %-20s%n", ranking, country, unemploymentRate, region);
                count++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }

        System.out.println("---------------------------------------------------------------");
    }
}

