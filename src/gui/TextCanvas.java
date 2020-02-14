package gui;

import java.awt.*;
import javax.swing.JPanel;

/**
 * TextCanvas
 */
public class TextCanvas extends JPanel {

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.drawString("Estamos aprendiendo Swing", 100, 100);

    }
    
}