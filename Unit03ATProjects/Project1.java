/* Chloe Larson
Java Project
I used chatgpt to help understand how to input military time and validate it, as well as how to format the output neatly.
*/
import java.util.Scanner;

public class Project1 {
   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           System.out.print("Enter your name: ");
           String name = scanner.nextLine();
              System.out.print("Enter the day of the week (first three letters): ");
              String dayInput = scanner.nextLine().toLowerCase();
              System.out.print("Enter the time (HH:MM): ");
              String rawTime = scanner.nextLine().trim();
              int hour = 0;
            int min = 0;
             if (rawTime.contains(":")) {
            int i = rawTime.indexOf(":");
            hour = Integer.parseInt(rawTime.substring(0, i));
            min = Integer.parseInt(rawTime.substring(i + 1));
        } else {
            System.err.println("Unable to parse time, stopping program.");
            return;
        }
        System.out.print("Enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Are you a student? (y/n): ");
            String studentInput = scanner.nextLine().toLowerCase();
            boolean isStudent = studentInput.equals("y");

                // Validate day input
                String day;
                switch (dayInput) {
                    case "monday", "mon" -> day = "MON";
                    case "tuesday", "tue" -> day = "TUE";
                    case "wednesday", "wed" -> day = "WED";
                    case "thursday", "thu" -> day = "THU";
                    case "friday", "fri" -> day = "FRI";
                    case "saturday", "sat" -> day = "SAT";
                    case "sunday", "sun" -> day = "SUN";
                    default -> {
                        System.out.println("Error: Invalid day entered.");
                        return;
                    }
                }
                // Base price
                double basePrice = 100.00;
                double ageDiscount = 0.0;
                double studentDiscount = -5.0;


                // Calculate age discount
                if (age >= 0 && age <= 2) {
                    ageDiscount = basePrice; // Free
                } else if (age >= 3 && age <= 12) {
                    ageDiscount = basePrice * 0.20; // 20% discount
                } else if (age >= 60) {
                    ageDiscount = basePrice * 0.25; // 25% discount

                    // calculate student discount (receive 5% off)
                    if (isStudent) {
                    studentDiscount -= 5.00; // Student discount
                    }
                }
                // Calculate final price
                double finalPrice = basePrice - ageDiscount;
                if (isStudent) {
                    finalPrice -= 5.00; // Student discount
                }

                // Format Output with lines separating the inputted data with the rest, and a line between the time and base price and the age discount and final price
                System.out.println("--------------------------------------------------");
                System.out.printf("Name: %s\nDay: %s\nTime: %02d:%02d\n", name, day, hour, min);
                System.out.println("--------------------------------------------------");
                //format the base price, age discount, and student discount with 2 decimal places aligned
                System.out.printf("Base Price: $%.2f\n Age Discount: $%.2f\n Student Discount: $%.2f\n", basePrice, ageDiscount, studentDiscount);
                System.out.println("--------------------------------------------------");
                System.out.printf("Final Price: $%.2f\n", finalPrice);
            }
        }
     }

