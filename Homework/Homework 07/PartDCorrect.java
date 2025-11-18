/* Chloe Larson
Part D (AT Section)
Roman Numeral Converter
*/

import java.util.Scanner;

public class PartDCorrect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Input ---
        System.out.print("Enter a positive integer (1 - 3999): ");
        int number = input.nextInt();

        // --- Validation ---
        if (number < 1 || number > 3999) {
            System.out.println("Error: Number must be between 1 and 3999.");
        } else {
            String roman = convertToRoman(number);
            System.out.println("Roman numeral: " + roman);
        }

        input.close();
    }

    // --- Conversion Method ---
    public static String convertToRoman(int num) {
        // Arrays for thousands, hundreds, tens, and ones
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        // Build Roman numeral string
        String roman = thousands[num / 1000]
                     + hundreds[(num % 1000) / 100]
                     + tens[(num % 100) / 10]
                     + ones[num % 10];

        return roman;
    }
}
