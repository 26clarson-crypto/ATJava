/* Chloe Larson
Part B
Lesson 20 - I used the internet for help on how to read the count, letters, and digits.*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PartB {
    public static void main(String[] args) throws IOException {

        File file = new File("characters.txt");
        FileReader reader = new FileReader(file);

        int ch;
        int charCount = 0;
        int letterCount = 0;
        int digitCount = 0;

        // Read character by character
        while ((ch = reader.read()) != -1) {
            char current = (char) ch;
            System.out.print(current);

            charCount++;

            if (Character.isLetter(current)) {
                letterCount++;
            } else if (Character.isDigit(current)) {
                digitCount++;
            }
        }

        reader.close();

        // Output counts
        System.out.println();
        System.out.println("count = " + charCount);
        System.out.println("letters = " + letterCount);
        System.out.println("digits = " + digitCount);
    }
}
