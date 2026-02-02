/* Chloe Larson
Part A
Lesson 20 - Used the internet for help on formatting the table and delimiters
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws IOException {

        // Open the CSV file
        File file = new File("customers.csv");
        Scanner input = new Scanner(file);

        // Use commas, whitespace, and new lines as delimiters
        input.useDelimiter("[,\\s\\n]+");

        // Print table header
        System.out.println("---------------------------------------");
        System.out.printf("%7s | %11s | %12s%n", "ID", "Name", "Balance");
        System.out.println("---------------------------------------");

        // Read and display each customer
        while (input.hasNext()) {
            int id = input.nextInt();
            String name = input.next();
            double balance = input.nextDouble();

            System.out.printf(
                "%06d | %11s | $%,12.2f%n",
                id, name, balance
            );
        }

        input.close();
    }
}

