/* Chloe Larson
Part A
06 AT Projects
*/

import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature and a 'C' for Celsius or 'F' for Fahrenheit: ");
        double temperature = scanner.nextDouble();
        char scale = scanner.next().toUpperCase().charAt(0);

        double tempInCelsius;

        if (scale == 'F') {
            tempInCelsius = (temperature - 32) * 5 / 9;
        } else if (scale == 'C') {
            tempInCelsius = temperature;
        } else {
            System.out.println("Invalid scale. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
            scanner.close();
            return;
        }

        String state;
        if (tempInCelsius <= 0) {
            state = "solid";
        } else if (tempInCelsius >= 100) {
            state = "gaseous";
        } else {
            state = "liquid";
        }

        System.out.printf("At a temperature of %.2f %c, water is in a %s state.%n", temperature, scale, state);
        scanner.close();
    }
}