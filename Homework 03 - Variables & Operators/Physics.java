import java.util.Scanner;

public class Physics {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter initial position (m): ");
		double s0 = scanner.nextDouble();

		System.out.print("Enter initial velocity (m/s): ");
		double v0 = scanner.nextDouble();

		System.out.print("Enter time (s): ");
		double t = scanner.nextDouble();

		final double g = -9.8;   // acceleration due to gravity (m/s^2)
		double s = s0 + v0 * t + 0.5 * g * t * t;  // final position (meters)
		System.out.println("The distance the object falls is: " + s + " meters in " + t + " seconds.");

        scanner.close();
        
	}
    
}
/* Chloe Larson
 * Homework 03 - Variables & Operators
 * Calculate the distance an object falls due to gravity over a given time period
 * 
 */
