/* Chloe Larson
Part B */

public class PartB {
    public static int getInt() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {
        System.out.println(getInt());
    }

}

// The output of this code will be:
// Finally block executed
// 1

// Explanation: The getInt() method returns 1 in the try block, but before it can return, 
// the finally block is executed, printing "Finally block executed". 
// After the finally block, the method returns 1.
