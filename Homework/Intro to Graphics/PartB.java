/* Chloe Larson
Part B
I used the internet to help the formatting and rotation but coudnt figure out how to format the text.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public class PartB extends JFrame {

    public PartB() {
        setTitle("Square");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(new Board());
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PartB app = new PartB();
            app.setVisible(true);
        });
    }
}

class Board extends JPanel {

    private static final int BOARD_WIDTH  = 350;
    private static final int BOARD_HEIGHT = 350;
    private static final int RECT_WIDTH   = 150;
    private static final int RECT_HEIGHT  = 150;
    private static final double ROTATION_RADIANS = Math.toRadians(22.5);

    public Board() {
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        setBackground(Color.CYAN);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);

        double cx = getWidth()  / 2.0;
        double cy = getHeight() / 2.0;

        // --- Rectangle ---
        Rectangle2D rect = new Rectangle2D.Double(0, 0, RECT_WIDTH, RECT_HEIGHT);
        AffineTransform translateToCenter = new AffineTransform();
        translateToCenter.translate(cx - RECT_WIDTH / 2.0, cy - RECT_HEIGHT / 2.0);
        AffineTransform rotateCW = new AffineTransform();
        rotateCW.rotate(ROTATION_RADIANS, cx, cy);
        AffineTransform combined = new AffineTransform(rotateCW);
        combined.concatenate(translateToCenter);
        Shape transformed = combined.createTransformedShape(rect);

        g2d.setColor(Color.PINK);
        g2d.fill(transformed);

        // --- "Hello, world!" text ---
        String message = "Hello, world!";
        g2d.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g2d.setColor(Color.BLACK);

        // Measure the string so we can center it horizontally
        FontMetrics fm = g2d.getFontMetrics();
        int textWidth = fm.stringWidth(message);
        int textX = (getWidth() - textWidth) / 2;
        int textY = getHeight() - 20;   // near the bottom of the panel
        // I cant figure out how to get this to format. 

        g2d.drawString(message, textX, textY);
    }
}