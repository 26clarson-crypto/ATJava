/* Chloe Larson 
Part A
Main code for calling on the mow package to create the yard. 
Updated for Part B */

import mow.Yard;
import mow.Mower;

public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }

    public static void main(String[] args) {
        // Create a yard with 5 rows and 24 columns of lawn
        Yard yard = new Yard(5, 24);

        // Place mower on the left side of the lawn, row 3, facing right
        Mower mower = new Mower(3, 1, 1);

        // Move across the yard until it hits the right brick border
        while (mower.senseForward(yard) != 'R') {
            mower.cutGrass(yard);   // cut grass under mower
            clearScreen();
            yard.print(mower);      // print yard with mower
            delay(500);   // wait half a second for a delay
            mower.moveForward();    // move right
        }

        // Cut the last cell and do a final print
        mower.cutGrass(yard);
        clearScreen();
        yard.print(mower);
    }
}