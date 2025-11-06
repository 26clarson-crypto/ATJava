/* Chloe Larson
 * Lesson 03 Java Test
 * AT Students Only
 * November 4, 2025
*/
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for side lengths
        System.out.print("Enter length of side 1: ");
        if (!in.hasNextInt()) {
            System.out.println("Error: Input must be an integer.");
            in.close();
            return;
        }
        // error code for each side length so once the wrong input is given the program stops
        int side1 = in.nextInt();
        if (side1 < 0) {
            System.out.println("Error: Side length must be greater than zero.");
            in.close();
            return;
        }

        System.out.print("Enter length of side 2: ");
        if (!in.hasNextInt()) {
            System.out.println("Error: Input must be an integer.");
            in.close();
            return;
        }
        int side2 = in.nextInt();
        if (side2 < 0) {
            System.out.println("Error: Side length must be greater than zero.");
            in.close();
            return;
        }
        System.out.print("Enter length of side 3: ");
        if (!in.hasNextInt()) {
            System.out.println("Error: Input must be an integer.");
            in.close();
            return;
        }
        int side3 = in.nextInt();
        if (side3 < 0) {
            System.out.println("Error: Side length must be greater than zero.");
            in.close();
            return;
        }
         // check to see if its a triangle, and then what type of triangle it is and print the result. 
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("That is not a triangle");
        } else if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is scalene");
        }
        in.close();
    }
}

