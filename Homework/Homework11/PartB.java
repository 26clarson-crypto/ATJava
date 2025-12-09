/* Chloe Larson
Part b

What will the result be of the call mystery(3, 2)? */

// The result will be -5.0 because (3 + 2) / (2 - 3) = 5 / -1 = -5.0`


public class PartB {
    public static double mystery(double x, double y)
{
   double result = (x + y) / (y - x);
   return result;
}

}
