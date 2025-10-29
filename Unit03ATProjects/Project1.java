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


              // take the time in military time, both hours and minutes as an integer
                int hourTime = 0;
        int minuteTime = 0;
        int militaryTime = 0;

        try {
            System.out.print("Enter the time (HHMM, 24-hour format): ");
            String input = scanner.nextLine().trim();

            // Check that the input is exactly 4 digits
            if (input.length() != 4 || !input.matches("\\d{4}")) {
                throw new NumberFormatException();
            }

            // Extract hour and minute
            hourTime = Integer.parseInt(input.substring(0, 2));
            minuteTime = Integer.parseInt(input.substring(2, 4));

            // Validate ranges
            if (hourTime < 0 || hourTime > 23 || minuteTime < 0 || minuteTime > 59) {
                throw new NumberFormatException();
            }

            // Store both in one integer if needed
            militaryTime = hourTime * 100 + minuteTime;

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid time entered.");
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
                System.out.printf("Name: %s\nDay: %s\nTime: %04d\n", name, day, militaryTime);
                System.out.println("--------------------------------------------------");
                //format the base price, age discount, and student discount with 2 decimal places aligned
                System.out.printf("Base Price: $%.2f\n Age Discount: $%.2f\n Student Discount: $%.2f\n", basePrice, ageDiscount, studentDiscount);
                System.out.println("--------------------------------------------------");
                System.out.printf("Final Price: $%.2f\n", finalPrice);
            }
        }
     }

