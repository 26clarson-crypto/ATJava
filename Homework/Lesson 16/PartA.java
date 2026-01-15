/* Chloe Larson
Part A
Used the internet for help with capitalization logic and how to use those variables. 
 */

import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phrases = new String[100];
        int count = 0;

        // Input loop
        while (true) {
            System.out.print("Enter a word or phrase or 'q' to quit: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            phrases[count++] = input;
        }

        // Print original phrases
        System.out.println("Words/Phrases (current size = " + count + "):");
        for (int i = 0; i < count; i++) {
            System.out.println("  " + phrases[i]);
        }

        // Cleanup and print modified phrases
        cleanup(phrases, count);
        System.out.println("Modified array...");
        System.out.println("Words/Phrases (current size = " + count + "):");
        for (int i = 0; i < count; i++) {
            System.out.println("  " + phrases[i]);
        }

        scanner.close();
    }

    public static void cleanup(String[] arr, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != null) {
                arr[i] = arr[i].trim();
                if (!arr[i].isEmpty()) {
                    arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
                }
            }
        }
    }
}