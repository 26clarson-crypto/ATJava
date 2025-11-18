import java.util.Scanner;

/* code asks user for a name
 * ask user for a number
 * ask user for a second number
 * divide the numbers
 * output the quotienet and the user's name
 */
public class Philip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // Ask user for a number
        System.out.print("Enter a number: ");
        double num1 = scanner.nextDouble();
        // Ask user for a second number
        System.out.print("Enter a second number: ");
        double num2 = scanner.nextDouble();
        // Divide the numbers
        double quotient = num1 / num2;
        // Output the quotient and the user's name
        System.out.println("Hello " + name + ", the result is: " + quotient);
        scanner.close();
    }
}


