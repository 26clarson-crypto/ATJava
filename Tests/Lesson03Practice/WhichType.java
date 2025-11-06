import java.util.Scanner;
public class WhichType {
   public static void main(String[] args) {
       enum CustomerType {
           INFANT, CHILD, ADULT, SENIOR
       }
       Scanner in = new Scanner(System.in);
       System.out.print("Enter customer age: ");
       double age;
       if (in.hasNextDouble()) {
           age = in.nextDouble();
           if (age < 0) {
               System.err.println("Error: age must be >= 0. Stopping program.");
               return;
           }
       } else {
           System.err.println("Error: unable to parse age. Stopping program.");
           return;
       }
       // determine customer type.
       CustomerType type;
       if (age >= 60) {
           type = CustomerType.SENIOR;
       } else if (age >= 13) {
           type = CustomerType.ADULT;
       } else if (age >= 3) {
           type = CustomerType.CHILD;
       } else {
           type = CustomerType.INFANT;
       }
       // print result.
       System.out.println("Customer type is " + type);
    }
}
