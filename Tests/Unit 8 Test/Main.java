/* Chloe Larson
Unit 8 Test
Harmonic Mean */

// import package for Algebra class
import org.derryfield.math.Algebra;

public class Main {

    public static void main(String[] args) { // input values for harmonic mean calculation
        double x = 6.0;
        double y = 7.0;

        try {
            double result = Algebra.harmonicMean(x, y); // call the harmonicMean method and store the result
            System.out.println("The harmonic mean of " + x + " and " + y + " is: " + result); // print results. 
        } catch (IllegalArgumentException e) { // throw an error message if the input values are invalid
            System.err.println("Error: " + e.getMessage());
        }
    }

}