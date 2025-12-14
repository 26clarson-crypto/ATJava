// Describe the error in the following program and explain how to fix it.

import java.util.Scanner;

public class PartA
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is your first name? ");
      String input = in.next();
      System.out.println("Hello, " + input);
      System.out.print("How old are you? ");
      int age = in.nextInt();
      age++;
      System.out.println("Next year, you will be " + age);
   }
}


/* There was a compile time error because input was declared twice in the same scope
It was declared as an integer and a string. 
I just changed the integer variable name to age to fix the conflict.*/