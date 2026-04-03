/* Chloe Larson
Unit 8 Test
Harmonic Mean */

// package declaration
package org.derryfield.math;

public class Algebra {

    // Method to calculate the harmonic mean of two positive numbers
    public static double harmonicMean(double x, double y) {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException( // Check for positive values
                "Both values must be positive. Received: x=" + x + ", y=" + y
            );
        }

        double sum = x + y;
        if (sum == 0) { // check for zero sum to avoid division by zero
            throw new IllegalArgumentException(
                "The sum of x and y must not be zero."
            );
        }

        return (2 * x * y) / sum; // calculate and return the harmonic mean
    }
}