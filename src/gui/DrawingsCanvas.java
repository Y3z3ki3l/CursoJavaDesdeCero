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

        Line2D myFirstLine2D = new Line2D.Double(100, 100, 300, 250);
        Line2D mySecondLine2D = new Line2D.Double(100, 200, 300, 350);
        Rectangle2D myRectangle2D = new Rectangle2D.Double(100, 100, 200, 150);
        
        Ellipse2D myElipse = new Ellipse2D.Double();
        myElipse.setFrame(myRectangle2D);

        g2D.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));
      
        /* 
        g2D.draw(new Line2D.Double(100, 100, 300, 250));
        g2D.draw(new Line2D.Double(100, 200, 300, 350));
         */

        /* 
        g2D.draw(myFirstLine2D);
        g2D.draw(mySecondLine2D);
 */

        Ellipse2D newEllipse = new Ellipse2D.Double();
        newEllipse.setFrameFromCenter(myRectangle2D.getCenterX(), myRectangle2D.getCenterY(), 
            myRectangle2D.getCenterX() + 125, myRectangle2D.getCenterY() + 125);

        g2D.draw(myRectangle2D);
        g2D.draw(myElipse);
        g2D.draw(new Line2D.Double(100, 100, 300, 250));
        g2D.draw(newEllipse);

    }

}