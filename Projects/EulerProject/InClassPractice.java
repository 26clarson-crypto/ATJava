
import java.util.Scanner;

public class InClassPractice {
    public static int min (int a, int b, int c){ 
        int min = a; 
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min; 
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = in.nextInt();
        System.out.print("Enter second integer: ");
        int b = in.nextInt();
        System.out.print("Enter third integer: ");
        int c = in.nextInt();
        
        int minimum = min(a, b, c);
        System.out.println("The minimum integer is: " + minimum);
        in.close();
    }
}