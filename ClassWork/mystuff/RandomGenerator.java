/* Chloe and Abby
In CLass Work
Used the intenet to remember how to generate a random integer.  */

import java.util.Random;

public class RandomGenerator {
    public static int getRandomInteger(int max) {
        Random rand = new Random();
        return rand.nextInt(max) + 1; // Generates a random integer from 1 to max
    }
}

