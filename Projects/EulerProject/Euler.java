import java.util.Scanner;

public class Euler {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the grid size (e.g., 20 for a 20x20 grid): ");
        int size = in.nextInt();

        long paths = calculatePaths(size + 1, size + 1);

        System.out.println("Number of paths from top left to bottom right: " + paths);

        in.close();
    }

    private static long calculatePaths(int rows, int cols) {
        long[][] dp = new long[rows][cols];
        dp[0][0] = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i > 0) dp[i][j] += dp[i - 1][j];
                if (j > 0) dp[i][j] += dp[i][j - 1];
            }
        }
        return dp[rows - 1][cols - 1];
    }
}