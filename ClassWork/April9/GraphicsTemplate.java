/* Chloe Larson
Graphics In Class
I used the internet for a picture of a sailboat and then to check some dimensions and how to open and close. */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsTemplate extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics Template");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GraphicsTemplate());
        frame.setSize(600, 500);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public static void draw(Graphics g) {

    // --- Sky ---
    g.setColor(new Color(135, 206, 235)); // light blue
    g.fillRect(0, 0, 600, 400);

    // --- Sun ---
    g.setColor(new Color(255, 215, 0)); // gold
    g.fillOval(40, 30, 80, 80);

    // --- Clouds ---
    g.setColor(Color.WHITE);
    g.fillOval(150, 50, 100, 40);
    g.fillOval(180, 40, 80, 40);
    g.fillOval(350, 30, 120, 45);
    g.fillOval(390, 20, 90, 40);

    // --- Water ---
    g.setColor(new Color(21, 101, 192)); // deep blue
    g.fillRect(0, 270, 600, 200);

    // --- Mast ---
    g.setColor(new Color(93, 64, 55)); // brown
    g.fillRect(290, 120, 6, 155);

    // --- Main sail (left side of mast) ---
    int[] mainX = {296, 296, 140};
    int[] mainY = {128, 262, 248};
    g.setColor(Color.WHITE);
    g.fillPolygon(mainX, mainY, 3);
    g.setColor(Color.LIGHT_GRAY);
    g.drawPolygon(mainX, mainY, 3);

    // --- Jib sail (right side of mast) ---
    int[] jibX = {296, 296, 450};
    int[] jibY = {128, 262, 242};
    g.setColor(new Color(227, 242, 253)); // very light blue-white
    g.fillPolygon(jibX, jibY, 3);
    g.setColor(Color.LIGHT_GRAY);
    g.drawPolygon(jibX, jibY, 3);

    // --- Flag ---
    g.setColor(new Color(229, 57, 53)); // red
    int[] flagX = {290, 276, 290};
    int[] flagY = {120, 128, 136};
    g.fillPolygon(flagX, flagY, 3);

    // --- Hull ---
    int[] hullX = {145, 455, 440, 160};
    int[] hullY = {272, 254, 292, 292};
    g.setColor(new Color(121, 85, 72)); // brown hull
    g.fillPolygon(hullX, hullY, 4);

    
}

}