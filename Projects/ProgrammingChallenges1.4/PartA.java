/* Chloe Larson
Problem 1
I used the internet for help on how to check if a string is a palindrome */

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String text = in.nextLine();

        // Remove spaces and make lowercase

        String cleaned = "";
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (c != ' ') {
                cleaned += c;
            }
        }

        // Reverse using a loop
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // Check if palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
