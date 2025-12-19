import java.util.Scanner;


public class InClassArrays {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //make my array
        final int SIZE = 100;
        double [] warehouse = new double [SIZE]
        int currSize = 0;

        while(true) { 
            System.out.print("Enter a test score or "g" to quit: ");
            if (in.hasNext("q")) {
                in.next()
                break;
            }
            else {
                double value = in.nextDouble();
                if (currSize< warehouse.length) {
                    warehouse{currSize} = value;
                    currSize++;

                }

                else {
                    System.err.println("Warehouse is full")
                    break; 
                }
            }
        }
        doulbe sum = 0;
        for(int i =0; i < currSize; i++) {
            sum += warehouse[i];
        }
        double average = sum / currSize;
        System.out.printf("The average score is %.2f\n", average);  
    }
}
