/* Chloe Larson
Part B
I used the internet and class resources for help with the counter class and the functions of the loops. 
 */

import java.util.Scanner;

public class PartB {

    // Counter class
    static class Counter {
        private int count;

        public Counter() {
            count = 0;
        }

        public void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        Counter cakeCounter = new Counter();
        Counter pieCounter = new Counter();

        char choice;

        System.out.println("Dessert Survey!");
        System.out.println("Enter 'c' for cake");
        System.out.println("Enter 'p' for pie");
        System.out.println("Enter 'q' to quit");

        do {
            System.out.print("Your choice: ");
            choice = scanner.next().toLowerCase().charAt(0);

            if (choice == 'c') {
                cakeCounter.increment();
            } 
            else if (choice == 'p') {
                pieCounter.increment();
            } 
            else if (choice != 'q') {
                System.out.println("Invalid input. Please enter c, p, or q.");
            }

        } while (choice != 'q');

        // Display totals after quitting
        System.out.println("\nSurvey Results:");
        System.out.println("Cake votes: " + cakeCounter.getCount());
        System.out.println("Pie votes: " + pieCounter.getCount());

        scanner.close();
    }
}