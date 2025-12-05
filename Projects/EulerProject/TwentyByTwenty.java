import java.util.Scanner;

public class TwentyByTwenty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[20][20];

        System.out.println("Enter the elements of the 20x20 matrix row by row:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (scanner.hasNextInt()) {
                    matrix[i][j] = scanner.nextInt();
                } else {
                    System.err.println("Not enough integers provided. Exiting.");
                    scanner.close();
                    return;
                }
            }
        }

        System.out.println("The entered 20x20 matrix is:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
