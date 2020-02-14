package gui;

import javax.swing.*;

/**
 * WritingOnFrame
 */
public class WritingOnFrame {

    public static void main(String[] args) {
        
        FrameWithText myTextFrame = new FrameWithText();

        // Aplicando principios SOLID, estas dos lineas se eliminan
        // y se delega el agregar el texto a la clada FrameWithText
        /* 
        Canvas textComponent = new Canvas();
        myTextFrame.add(textComponent);
         */

        myTextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}