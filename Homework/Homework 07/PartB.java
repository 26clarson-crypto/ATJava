
import java.util.Scanner;

public class PartB {

    // Enumerated type for customer category
    enum CustomerType {
        CHILD, ADULT, SENIOR
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask if it's Monday
        System.out.print("Is it Monday? (yes/no): ");
        String isMondayInput = scanner.nextLine().trim().toLowerCase();
        boolean isMonday = isMondayInput.equals("yes");

        // Prompt for age
        System.out.print("Enter the age of the customer: ");
        int age = scanner.nextInt();

        // Prompt for cost of meal
        System.out.print("Enter the cost of the meal: ");
        double mealCost = scanner.nextDouble();

        // Determine the customer type using the enum
        CustomerType customerType;
        if (age < 13) {
            customerType = CustomerType.CHILD;
        } else if (age >= 50) {
            customerType = CustomerType.SENIOR;
        } else {
            customerType = CustomerType.ADULT;
        }

        double discount = 0.0;

        // Apply discounts based on day and customer type
        if (isMonday) {
            switch (customerType) {
                case CHILD:
                    discount = 0.075; // 7.5%
                    break;
                case SENIOR:
                    discount = 0.15; // 15%
                    break;
                case ADULT:
                    discount = 0.05; // 5%
                    break;
            }
        } else {
            switch (customerType) {
                case CHILD:
                    discount = 0.05; // 5%
                    break;
                case SENIOR:
                    discount = 0.075; // 7.5%
                    break;
                case ADULT:
                    discount = 0.0; // No discount
                    break;
            }
        }

        // Calculate discounted cost
        double discountedCost = mealCost - (mealCost * discount);

        // Display results
        System.out.println("\nCustomer Type: " + customerType);
        System.out.printf("The discounted cost of the meal is: $%.2f%n", discountedCost);

        scanner.close();
    }
}

