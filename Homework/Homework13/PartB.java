/* Chloe Larson
Part B - Graphics
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;

// I used the internet for help on using methods within graphics object such as with the protected void paintComponent(Graphics g) method

public class PartB extends JPanel {

    // Constants for layout
    private static final int PANEL_SIZE = 400;
    private static final int TILE_SIZE = 100;
    private static final int ROWS = PANEL_SIZE / TILE_SIZE;
    private static final int COLS = PANEL_SIZE / TILE_SIZE;

 @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGrid(g);
    }

    // Draw the full grid using nested loops
    private void drawGrid(Graphics g) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                drawTile(g, row, col);
            }
        }
    }

    // Draw a single tile
    private void drawTile(Graphics g, int row, int col) {
        g.setColor(getTileColor(row, col));

        int x = col * TILE_SIZE;
        int y = row * TILE_SIZE;

        g.fillRect(x, y, TILE_SIZE, TILE_SIZE);
    }

    // Determine tile color based on row and column
    private Color getTileColor(int row, int col) {
        if ((row + col) % 2 == 0) {
            return Color.BLUE;
        } else {
            return Color.RED;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Alternating Tile Grid");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            PartB panel = new PartB();
            panel.setPreferredSize(new Dimension(PANEL_SIZE, PANEL_SIZE));

            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
