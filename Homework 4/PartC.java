/* Homework 04
 * Part C
 * Chloe Larson
 * Code for an architect to design a floor plan
 * Rows of alternating black and white tiles
 * Each row must have black tiles on each end of each row
 * Each tile is 5 inches wide
 * Calculate how big the gap is on each side of the floor plan
 * Specify the amount of black and white tiles used.
 */

public class PartC {
    public static void main(String[] args) {
        // Ask user for width of floor plan
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter the width of the floor plan in inches (must be at least 15 inches): ");
        double width = in.nextDouble();

        // Validate input
        if (width < 15) {
            System.out.println("Invalid input. Width must be at least 10 inches.");
            return;
        }
        // Calculate number of tiles
        int tileWidth = 5;
        double numTiles = (int) (width / tileWidth);

        // Calculate gaps
        double gap = (int) (width % tileWidth);

        // Display results
        // Display how many white tiles
        double numWhiteTiles = Math.floor(numTiles / 2);
        // Display how many black tiles
        double numBlackTiles = Math.ceil(numTiles / 2);
        System.out.println("Number of tiles: " + numTiles);
        System.out.println("Number of white tiles: " + numWhiteTiles);
        System.out.println("Number of black tiles: " + numBlackTiles);
        System.out.println("Gap on each side: " + (gap / 2) + " inches");
    }
}
