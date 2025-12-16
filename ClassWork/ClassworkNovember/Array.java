
public class Array {
    public static void main (String [] args) {
        // declare my array
        int [] values;

        //make my array
        values = new int [5];

        // ask the user for 5 values
        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i=0; i<values.length; i++) {
            System.out.println("Enter a number:");
            values [i]=input.nextInt();
        }

        // print the numbers back out and put <= largest number next to the largest number
        int max = values[0];
        for (int i=1; i<values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        for (int number : values) {
            System.out.print(number);
            if (number == max) {
                System.out.print(" <= largest number");
            }
            System.out.println();
        }
        input.close();
    }
}