/* Chloe Larson
Part A
I used the internet to clarify methods and intiliazing. 
 */

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in;


        in = new Scanner(System.in);

    
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");


        System.out.print("Please enter your age: ");
        int age = in.nextInt();
        System.out.println("You are " + age + " years old.");

    
        in.close();
    }
}