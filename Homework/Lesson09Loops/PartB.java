/* Chloe Larson
Part B
Lesson 09 - Loops
 */
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String phrase = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'e') {
                count++;
            }
        }

        System.out.println("Number of letters 'e' found: " + count);
    }
}
