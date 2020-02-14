package gui;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.JPanel;

/**
 * DrawingsCanvas
 */
public class DrawingsCanvas extends JPanel {
    /* 
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        // g.drawRect(50, 50, 100, 100);
        g.drawLine(50, 50, 250, 250);

    }
     */

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        // Aplicando refundicion
        Graphics2D g2D = (Graphics2D) g;

        g2D.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));
        g2D.draw(new Line2D.Double(100, 100, 300, 250));

        g2D.draw(new Line2D.Double(100, 200, 300, 350));

    }

}