package gui;

import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * DrawingFrame
 */
public class DrawingFrame extends JFrame {
    
    public DrawingFrame(){

        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension scrSize = screen.getScreenSize();
        int scrWidht = scrSize.width;
        int scrHeight = scrSize.height;

        DrawingsCanvas myShape = new DrawingsCanvas();

        setVisible(true);
        setBounds(scrWidht/4, scrHeight/4, scrWidht/2, scrHeight/2);
        setTitle("Drawings");

        add(myShape);

    }
    
}