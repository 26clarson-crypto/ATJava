/* Chloe and Abby
DemoApp.java */

import java.util.Random;
// import this from mystuff package

public class DemoApp {
    public static void main(String[] args) {
        int max = 100; // Set the maximum value for random integers
        System.out.println("Here are 5 randomly generated numbers from 1 to " + max + ":");
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(max) + 1;
            System.out.println("  " + randomNumber);
        }
        System.out.println("Goodbye!");
    }
}
