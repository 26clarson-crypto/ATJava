// print a multiplicatable table from with row one having 1, 2, 3 and row two having 2, 4 ,6 and row three having 3, 6, 9. thats oit

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
