import java.util.Scanner;

/* Chloe Larson
Part c*/

public class PartC {

     public static double sphereVolume(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        double volume = sphereVolume(radius);
        System.out.println("The volume of the sphere is: " + volume);
        scanner.close();
    }

}