import java.util.Scanner;


public class Tax {
   public static void main(String[] args) {
       final double FIRST_RATE = 0.05;
       final double SECOND_RATE = 0.075;
       final double THIRD_RATE = 0.10;


       // prompt user for the sales amount.
       Scanner in = new Scanner(System.in);
       System.out.print("Enter sales amount ($): ");


       double sales;
       if (in.hasNextDouble()) {
           sales = in.nextDouble();
           if (sales < 0) {
               System.err.println("Sales amount must be greater than or equal to zero. Stopping program.");
               return;
           }
       } else {
           System.err.println("Unable to parse sales amount. Stopping program.");
           return;
       }


       // use conditional statements to calculate tax amount.
       double tax = 0;
       if (sales > 500000) {
           tax = 100000 * FIRST_RATE + 400000 * SECOND_RATE + (sales - 500000) * THIRD_RATE;
       } else if (sales > 100000) {
           tax = 100000 * FIRST_RATE + (sales - 100000) * SECOND_RATE;
       } else {
           tax = sales * FIRST_RATE;
       }


       // print results.
       System.out.printf("Sales amount: $%,16.2f%n", sales);
       System.out.printf("Tax amount:   $%,16.2f%n", tax);
   }
}

