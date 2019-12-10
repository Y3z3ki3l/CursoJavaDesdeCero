package gui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * MarcoCentrado
 */
public class MarcoCentrado extends JFrame {

    public MarcoCentrado(){
        
        // Obteniendo el sistema de ventenas nativo
        Toolkit myScreen = Toolkit.getDefaultToolkit();    
        Dimension screenSize = myScreen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setBounds(screenWidth/4, screenHeight/4, screenWidth/2, screenHeight/2);
        setTitle("MarcoCentrado");

        Image myIcon = myScreen.getImage("C:/Users/fmunozgu/Documents/CursoJavaDesdeCeroPI/PrimerosPasos/src/gui/git_icon_001.png");

        setIconImage(myIcon);

    }

}