import javax.swing.JOptionPane;

public class Demo {
    public static void main(String[] args) {
        String first_name = JOptionPane.showInputDialog("Enter your name:");
        String last_name = JOptionPane.showInputDialog("Enter your last name:");
        JOptionPane.showMessageDialog(null, "Hello, " + first_name + " " + last_name + "!");
    }
}
