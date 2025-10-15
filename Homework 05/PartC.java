/* Chloe Larson
 * Part C
 * 9/29/2025
 */
public class PartC {
    public static void main(String[] args) {
        // Use a dialog box to prompt the user for their name
        String name = javax.swing.JOptionPane.showInputDialog("Enter your name:");
        // Use a dialog box to prompt the user for a number
        String num1Str = javax.swing.JOptionPane.showInputDialog("Enter a number:");
        double num1 = Double.parseDouble(num1Str);
        // Use a dialog box to prompt the user for a second number
        String num2Str = javax.swing.JOptionPane.showInputDialog("Enter a second number:");
        double num2 = Double.parseDouble(num2Str);
        // Perform calculation using the two numbers
        double result = num1 / num2;
        // Display user's name and the results of the calculation to a dialog box
        javax.swing.JOptionPane.showMessageDialog(null, "Hello " + name + ", the result is: " + result);
    }
}
