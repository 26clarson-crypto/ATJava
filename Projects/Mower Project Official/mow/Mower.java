/* Chloe Larson
Part B
I used the internet for help on direction and logic regarding the moving function.   */

package mow;

public class Mower {
    private int row;
    private int col;
    private int direction; // 0=up, 1=right, 2=down, 3=left

    public Mower(int row, int col, int direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
    }

    // mowing methods
    public int getRow() { return row; }
    public void setRow(int row) { this.row = row; }

    public int getCol() { return col; }
    public void setCol(int col) { this.col = col; }

    public int getDirection() { return direction; }
    public void setDirection(int direction) { this.direction = direction; }

    // Move forward one unit in the current direction
    public void moveForward() {
        if (direction == 0) row--;       // up
        else if (direction == 1) col++;  // right
        else if (direction == 2) row++;  // down
        else if (direction == 3) col--;  // left
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
}