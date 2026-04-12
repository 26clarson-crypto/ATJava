/* Chloe L
Updated Part C
Internet used for help on getting/setting values and mowing mechanics. */

package mow;
import java.util.Random;

public class Mower {
    private int row;
    private int col;
    private int direction; // 0=up, 1=right, 2=down, 3=left

    public Mower(int row, int col, int direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
    }

    // Getters and setters
    public int getRow() { return row; }
    public void setRow(int row) { this.row = row; }

    public int getCol() { return col; }
    public void setCol(int col) { this.col = col; }

    public int getDirection() { return direction; }
    public void setDirection(int direction) { this.direction = direction; }

    // Move forward one unit in the current direction
    public void moveForward() {
        if (direction == 0) row--;
        else if (direction == 1) col++;
        else if (direction == 2) row++;
        else if (direction == 3) col--;
    }

    // Turn left
    public void turnLeft() {
        direction = (direction + 3) % 4;
    }

    // Turn right
    public void turnRight() {
        direction = (direction + 1) % 4;
    }

    // Sense what is one unit in front of the mower
    public char senseForward(Yard yard) {
        int nextRow = row;
        int nextCol = col;
        if (direction == 0) nextRow--;
        else if (direction == 1) nextCol++;
        else if (direction == 2) nextRow++;
        else if (direction == 3) nextCol--;
        return yard.getCell(nextRow, nextCol);
    }

    // Sense what is to the right of the mower
    public char senseRight(Yard yard) {
        int nextRow = row;
        int nextCol = col;
        int rightDir = (direction + 1) % 4;
        if (rightDir == 0) nextRow--;
        else if (rightDir == 1) nextCol++;
        else if (rightDir == 2) nextRow++;
        else if (rightDir == 3) nextCol--;
        return yard.getCell(nextRow, nextCol);
    }

    // Sense what is to the left of the mower
    public char senseLeft(Yard yard) {
        int nextRow = row;
        int nextCol = col;
        int leftDir = (direction + 3) % 4;
        if (leftDir == 0) nextRow--;
        else if (leftDir == 1) nextCol++;
        else if (leftDir == 2) nextRow++;
        else if (leftDir == 3) nextCol--;
        return yard.getCell(nextRow, nextCol);
    }

    // Cut the grass under the mower
    public void cutGrass(Yard yard) {
        yard.setCell(row, col, ' ');
    }

    // Returns the character representing the mower's direction
    public char getDirectionChar() {
        if (direction == 0) return '^';
        else if (direction == 1) return '>';
        else if (direction == 2) return 'v';
        else return '<';
    }

    // Randomize the mower's position to one of the four corners of the lawn
    public void randomize(Yard yard) {
        Random rand = new Random();
        int lawnHeight = yard.getLawnHeight();
        int lawnWidth  = yard.getLawnWidth();

        // Four corners of the lawn (inside the brick border)
        int[][] corners = {
            {1, 1},                          // top-left
            {1, lawnWidth},                  // top-right
            {lawnHeight, 1},                 // bottom-left
            {lawnHeight, lawnWidth}          // bottom-right
        };

        // Pick a random corner
        int[] corner = corners[rand.nextInt(4)];
        row = corner[0];
        col = corner[1];

        // Pick a random direction
        direction = rand.nextInt(4);
    }

    // Update the mower using a spiral pattern
    // Returns true if there are still unmowed spots, false if done
    public boolean updateMower(Yard yard) {
        // Cut the grass under the mower first
        cutGrass(yard);

        // Check if any unmowed grass remains in the entire yard
        if (!hasUnmowedGrass(yard)) {
            return false;
        }

        // Spiral logic:
        // 1. If unmowed grass is in front, move forward
        if (senseForward(yard) == '+') {
            moveForward();
            return true;
        }

        // 2. If unmowed grass is to the right, turn right and move forward
        if (senseRight(yard) == '+') {
            turnRight();
            moveForward();
            return true;
        }

        // 3. If unmowed grass is to the left, turn left and move forward
        if (senseLeft(yard) == '+') {
            turnLeft();
            moveForward();
            return true;
        }

        // 4. No unmowed grass in front, right, or left — turn around
        turnRight();
        turnRight();
        if (senseForward(yard) == '+') {
            moveForward();
            return true;
        }

        // 5. Still stuck — scan the whole yard for any unmowed spot and go there
        for (int i = 1; i <= yard.getLawnHeight(); i++) {
            for (int j = 1; j <= yard.getLawnWidth(); j++) {
                if (yard.getCell(i, j) == '+') {
                    row = i;
                    col = j;
                    return true;
                }
            }
        }

        return false;
    }

    // Helper: checks if any unmowed grass remains in the yard
    private boolean hasUnmowedGrass(Yard yard) {
        for (int i = 1; i <= yard.getLawnHeight(); i++) {
            for (int j = 1; j <= yard.getLawnWidth(); j++) {
                if (yard.getCell(i, j) == '+') {
                    return true;
                }
            }
        }
        return false;
    }
}