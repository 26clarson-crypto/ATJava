/* Chloe Larson
 */

public class PartD {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of cookies you want to purchase: ");
        int quantity = scanner.nextInt();
        scanner.close();

        double pricePerCookie = 0.99;
        double totalCost = quantity * pricePerCookie;
        double discount = 0;

        if (quantity > 24) {
            discount = 0.15;
        } else if (quantity > 12) {
            discount = 0.05;
        } else if (quantity > 6) {
            discount = 0.025;
        }

        totalCost -= totalCost * discount;

        System.out.printf("Total cost for %d cookies: $%.2f%n", quantity, totalCost);
    }

}
