// Chloe Larson
// Part A
// Used the interenet to understand the packages. 

// The LocalDate and LocalTime classes are part of the java.time package, which is a subpackage of java.

import java.time.LocalDate;
import java.time.LocalTime;

public class PartA {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        // Display the current date and time
        System.out.println("Today's date is " + currentDate);
        System.out.println("The time is " + currentTime);
    }
}
