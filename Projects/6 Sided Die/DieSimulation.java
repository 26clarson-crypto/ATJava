/* Chloe Larson
Die Project */


import java.util.Scanner;

public class DieSimulation {

    public static void main(String[] args) {

        // called on Die class to create a die object and a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        Die die = new Die();

        String input = "";

        // used a loop to let the user contiune rolling and display until user quits. 
        while (!input.equals("q")) {

            System.out.print("Enter 'r' to roll, 'd' to display, or 'q' to quit: ");
            input = scanner.nextLine();

            if (input.equals("r")) {
                die.roll();
                System.out.println("die was rolled. value = " + die.getValue());
            }
            else if (input.equals("d")) {
                die.display();
            }
            else if (input.equals("q")) {
                System.out.println("Bye!");
            }
        }

        scanner.close();
    }
}