/* Chloe Larson
 * This program demonstrates how to get input from a user. 
 * It also shows how to display that information back to the user. 
 * Need to import the Scanner class
 * to get input from the keyboard.
 */
import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = inputScanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.print("What is your favorite dessert?: ");
        String dessert = inputScanner.nextLine();
        System.out.println("Your favorite dessert is " + dessert + ".");
        inputScanner.close();
    }
}
