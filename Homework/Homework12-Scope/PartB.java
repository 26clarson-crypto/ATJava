/* Chloe Larson
Part B
 */

public class PartB 
{
   public static void main(String[] args)
   {
      double a = 3.5;
      double b = 2.1;
      double c = 4.8;
      
      double result = smallest(a, b, c);
      System.out.println("The smallest of " + a + ", " + b + ", and " + c + " is " + result);
   }

   public static double smallest(double x, double y, double z)
   {
      if (x <= y && x <= z)
      {
         return x;
      }
      else if (y <= x && y <= z)
      {
         return y;
      }
      else
      {
         return z;
      }
   }

}