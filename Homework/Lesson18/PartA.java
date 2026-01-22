/* Chloe Larson
Part A
Lesson 18
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        // Loop to get names from the user
        while (true) {
            System.out.print("Enter a name (or # to quit): ");
            input = scanner.nextLine();
            if (input.equals("#")) {
                break;
            }
            names.add(input);
        }

        // Print each name on a separate line
        System.out.println("Names entered:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
