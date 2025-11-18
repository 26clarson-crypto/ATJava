/* Chloe Larson
 * 9/292/2025
 * Part A
 */

import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter their name
        System.out.print("Enter your first middle and last names: ");
        String name = input.nextLine();
        // Give user their monogram
        String[] nameParts = name.split(" ");
        String monogram = "";
        for (String part : nameParts) {
            monogram += part.charAt(0);
        }
        System.out.println("Your monogram is: " + monogram.toUpperCase());
        input.close();
    }
}
