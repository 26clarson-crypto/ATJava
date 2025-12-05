import java.math.BigInteger;
import java.util.Scanner;

/*
 * This program solves the lattice problem #15 from the Project Euler.
 * This is for the SW Design with Java course.
 * 
 * Problem 15: Starting in the top left corner of a grid and only being able 
 * to move to the right and down, there are exactly 6 routes to the bottom right corner. 
 * How many such routes are there through a  grid?
 *
 * This is a combination problem.  The steps of a path break down as a sequence
 * of downward (d) and rightward (r) moves.  
 * 
 * In an n by m matrix (rows x cols) there are n downward moves and m rightward moves.
 * As you select a move, there is no repetition of a selected move, so the number
 * of combinations that are possible is equal to (n + m)! (where the ! symbol represents
 * the factorial function).
 * 
 * Since the order of the steps does not matter, the number of unique combinations is
 * (n+m)! / (n! * m!).
 * 
 * Problem #15 asks to solve the number of steps for a 20 x 20 grid.
 * This creates an added problem for a Java program, because if you evaluate 20! You'll find
 * that it's too large in value to be represented by either an int or long data type.
 * 
 * This program uses the BigInteger class to represent really large integer values.
 * the bigFactorial function is simply the factorial function that takes an input integer value and
 * returns an output BigInteger value.
 */

public class Euler2 {

    /*
     * bigFactorial takes an integer value and calculates the factorial of the input
     * value.
     * it returns the answer as a BigInteger object. The BigInteger object can store
     * very large integer values that would otherwise overflow a variable of int or
     * long data type.
     */
    public static BigInteger bigFactorial(int val) {
        BigInteger answer = new BigInteger("1");
        if (val < 0) {
            // return -1 as an error value.
            answer = new BigInteger("-1");
        } else {
            // iteratively solve for the factorial value.
            while (val > 0) {
                answer = answer.multiply(BigInteger.valueOf(val));
                val--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // prompt user for number of rows and columns.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter number of cols: ");
        int cols = in.nextInt();

        // number of unique combos is equal to (n+m)! / (n! * m!)
        BigInteger val = bigFactorial(rows + cols);
        val = val.divide(bigFactorial(rows));
        val = val.divide(bigFactorial(cols));

        // display solution.
        System.out.printf("For a %d x %d grid, there are %s unique routes.%n", rows, cols, val.toString());

        // close Scanner object.
        in.close();
    }
}
