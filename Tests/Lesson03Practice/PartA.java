/* Chloe Larson
 * Fall 2023
 * Part A
 */
import java.util.Scanner;

public class PartA {
    public enum CustomerType {
        INFANT, CHILD, ADULT, SENIOR
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            if (age >= 0) {
                CustomerType customerType;
                if (age >= 60) {
                    customerType = CustomerType.SENIOR;
                } else if (age >= 13) {
                    customerType = CustomerType.ADULT;
                } else if (age >= 3) {
                    customerType = CustomerType.CHILD;
                } else {
                    customerType = CustomerType.INFANT;
                }
                System.out.println("Customer type is: " + customerType);
            } else {
                System.err.println("Invalid age. Age must be a non-negative integer.");
            }
        } else {
            System.err.println("Invalid input. Please enter a numerical value.");
        }
        scanner.close();
    }
}