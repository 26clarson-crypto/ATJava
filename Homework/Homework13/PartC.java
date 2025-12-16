/* Chloe Larson
Part C - Graphics
 */
import java.awt.*;
import javax.swing.*;

public class PartC extends JPanel {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;

    private static final int STEPS = 1000;
    private static final double SCALE = 150.0;

    // Used the itnernet for the override thing because im not sure how else to do it
      @Override
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawRose(g);
    }

    private void drawRose(Graphics g) {
        g.setColor(Color.BLUE);

        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;

        // I used the internet to find the equations and understand the math for drawing a four-leaved rose
        for (int i = 0; i <= STEPS; i++) {
            double theta = (2 * Math.PI / STEPS) * i;

            double r = Math.cos(2 * theta);

            double x = SCALE * r * Math.cos(theta);
            double y = SCALE * r * Math.sin(theta);

            int plotX = (int) x + centerX;
            int plotY = centerY - (int) y; // invert y-axis

            g.fillOval(plotX, plotY, 2, 2);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Four-Leaved Rose");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            PartC panel = new PartC();
            panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            panel.setBackground(new Color(255, 200, 200)); // light pink

            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
