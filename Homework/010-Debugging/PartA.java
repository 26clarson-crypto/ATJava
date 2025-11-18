/* Chloe Larson
 * Part A
 * Debugging
 */


public class PartA {
     public static void main(String[] args) {
            String name = "Harry";
            System.out.println("The last letter of the name is " +
                    name.charAt(name.length () - 1));
        }
    }

    // run time error: the name was shorter than 5, because Harry is 0 to 4, so need to minus 1 from length
