

import java.util.Scanner;

public class Dec9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double average = (num1 + num2) / 2;
        System.out.printf("The average of %.2f and %.2f is %.2f%n", num1, num2, average);

        scanner.close();
    }
}