package gui;

import javax.swing.JFrame;

/**
 * FrameWithText
 */
public class FrameWithText extends JFrame {

    public FrameWithText() {

        TextCanvas textComponent = new TextCanvas();
        
        setVisible(true);
        setSize(600, 450);
        setLocation(400, 200);
        setTitle("Text Frame");

        add(textComponent);

    }

}