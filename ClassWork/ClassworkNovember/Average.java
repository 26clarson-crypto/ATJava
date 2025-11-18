
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalWeight = 0;
        int count = 0;
        String input;

        while (true) {
            System.out.print("Enter the weight of the apple (or 'q' to quit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                double weight = Double.parseDouble(input);
                if (weight >= 0) {
                    totalWeight += weight;
                    count++;
                } else {
                    System.out.println("Please enter a positive weight.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value or 'q' to quit.");
            }
        }

        if (count > 0) {
            double averageWeight = totalWeight / count;
            System.out.printf("Average weight of apples entered: %.2f%n", averageWeight);
        } else {
            System.out.println("No weights were entered.");
        }

        scanner.close();
    }
}