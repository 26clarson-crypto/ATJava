/* Chloe Larson
Part D
Debugging Practice
 */
public class PartD {
    public static void main(String[] args) {
        int n = 5; // number of rows
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n - i; j >= 1; j--) {
                System.out.print(".");
            }
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
