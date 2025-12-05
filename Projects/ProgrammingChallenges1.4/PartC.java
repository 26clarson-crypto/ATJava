/* Chloe Larson
Problem 3 
 */

import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        // Handle special cases
        if (n <= 1) {
            System.out.println(n + " is not prime.");
            return;
        }

        boolean isPrime = true;

        // Check divisors from 2 up to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break; // no need to keep checking
            }
        }

        if (isPrime) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }
    }
}
