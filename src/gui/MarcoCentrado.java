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
        
        // Obteniendo el sistema de ventanas nativo, para obtener tamaño de pantalla
        Toolkit myScreen = Toolkit.getDefaultToolkit();    
        Dimension screenSize = myScreen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setLocation(screenWidth/4, screenHeight/4);
        setSize(screenWidth/2, screenHeight/2);
        // setBounds(screenWidth/4, screenHeight/4, screenWidth/2, screenHeight/2);
        setTitle("MarcoCentrado");

        Image myIcon = myScreen.getImage("C:/Users/Y3Z3K13L/Documents/JavaLearning/CursoJavaDesdeCero_PrimerosPasos/src/gui/git_icon_001.png" );

        setIconImage(myIcon);

    }

}