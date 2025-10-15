
/* Chloe Larson
 * Homework 04
 * Part B
 * Asks user for the length, width, and height in cm of a box
 * The dimensions can have fractional components (i.e., not integers)
 * Calculates the surface area of the box (in cm2)
 * Calculates the volume of the box (in cm3)
 * Displays the dimensions, surface area, and volume with the decimal places all aligned
 * Assume max value is 9,999,999.99
 * Example output:
 * Enter the length, width, and height (cm) of the box: 234.56 241 99.9
 * length (cm)     =     234.56
 * width  (cm)     =     241.00
 * height (cm)     =      99.90
 * surface area (sq cm)  =  208074.81
 * volume (cu cm)  = 5647243.10

 */
public class PartB {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter the length, width, and height (cm) of the box: ");
        double length = in.nextDouble();
        double width = in.nextDouble();
        double height = in.nextDouble();

        // Calculate surface area and volume
        double surfaceArea = 2 * (length * width + width * height + height * length);
        double volume = length * width * height;

        // Display results
        System.out.printf("length (cm)     = %10.2f\n", length);
        System.out.printf("width  (cm)     = %10.2f\n", width);
        System.out.printf("height (cm)     = %10.2f\n", height);
        System.out.printf("surface area (sq cm)  = %10.2f\n", surfaceArea);
        System.out.printf("volume (cu cm)  = %10.2f\n", volume);
    }
}
