public class PartA {
   // Chloe Larson
   // Part A
   // This program calculates the volume of a cube given the length of its side.
   // The formula for the volume of a cube is sideLength^3.
   // The program prints the volume for two different side lengths.
   // The first side length is 2, and the second is 10.

public static void main(String[] args)
{
   double len = 2;
   double result = cubeVolume(len);
   System.out.println(result);
   len = 10;
   result = cubeVolume(len);
   System.out.println(result);
}
public static double cubeVolume(double sideLength)
{   
   double volume = sideLength * sideLength * sideLength;
   return volume;
}
}
