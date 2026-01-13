/* Chloe Larson
Part B
Used the internet for help on how to figure out how many target integer values there were and how to format the values */
import java.util.Scanner;

public class PartB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[20];
        int currentSize = 0;

        // Input loop
        while (currentSize < values.length) {
            System.out.printf("Enter up to 20 integer values or 'q' to quit: ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();  // skip over the 'q'
                break;         // exit loop
            } else {
                try {
                    values[currentSize] = input.nextInt();
                    currentSize++;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
                    input.next(); // clear invalid input
                }
            }
        }

        // Print the values in the partially filled array
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            if (i < currentSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Prompt for target integer value
        System.out.print("Enter a target integer value: ");
        int targetValue = input.nextInt();

        // Count occurrences of target value
        int count = 0;
        for (int i = 0; i < currentSize; i++) {
            if (values[i] == targetValue) {
                count++;
            }
        }

        // Print the result
        System.out.printf("The value %d occurs %d times in your original data set.%n", targetValue, count);

        input.close();
    }
    
}
