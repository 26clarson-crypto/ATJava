/* Chloe Larson 
Part A
Main code for calling on the mow package to create the yard.  */

import mow.Yard;
import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clearScreen();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the yard: ");
        int height = scanner.nextInt();

        System.out.print("Enter the width of the yard: ");
        int width = scanner.nextInt();

        System.out.println();

        Yard yard = new Yard(height, width);
        yard.print();

        scanner.close();
    }
}