
/* Chloe Larson
Problem 2
I used the internet for help on the formatting of the dice and how to pause the program */

import java.util.Random;

public class PartB {
    public static void main(String[] args) {
        Random rand = new Random();
        int die1, die2;
        int rollCount = 0;

        do {
            rollCount++;
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;

            System.out.println("Roll #" + rollCount + ": " + die1 + " and " + die2);
            printTwoDiceSideBySide(die1, die2);
            System.out.println(); // blank line between rolls

            // small pause so output is easier to read (optional)
            try {
                Thread.sleep(350); // 350 ms
            } catch (InterruptedException e) {
                // ignore
            }

        } while (die1 != die2);

        System.out.println("Both dice matched! Value: " + die1);
    }

    // Return the ASCII die as an array of 5 lines
    public static String[] dieLines(int value) {
        switch (value) {
            case 1:
                return new String[]{
                    "+-------+",
                    "|       |",
                    "|   O   |",
                    "|       |",
                    "+-------+"
                };
            case 2:
                return new String[]{
                    "+-------+",
                    "| O     |",
                    "|       |",
                    "|     O |",
                    "+-------+"
                };
            case 3:
                return new String[]{
                    "+-------+",
                    "| O     |",
                    "|   O   |",
                    "|     O |",
                    "+-------+"
                };
            case 4:
                return new String[]{
                    "+-------+",
                    "| O   O |",
                    "|       |",
                    "| O   O |",
                    "+-------+"
                };
            case 5:
                return new String[]{
                    "+-------+",
                    "| O   O |",
                    "|   O   |",
                    "| O   O |",
                    "+-------+"
                };
            case 6:
                return new String[]{
                    "+-------+",
                    "| O   O |",
                    "| O   O |",
                    "| O   O |",
                    "+-------+"
                };
            default:
                // should never happen
                return new String[]{
                    "+-------+",
                    "|???????|",
                    "|???????|",
                    "|???????|",
                    "+-------+"
                };
        }
    }

    // Print two dice side-by-side by combining corresponding lines
    public static void printTwoDiceSideBySide(int a, int b) {
        String[] A = dieLines(a);
        String[] B = dieLines(b);

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + "   " + B[i]);
        }
    }
}
