package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.*;

/**
 * EventTesting
 */
public class EventTesting {

    public static void main(String[] args) {
        
        ButtonFrame myFrame = new ButtonFrame();

        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}


/**
 * ButtonFrame
 */
class ButtonFrame extends JFrame {

    public ButtonFrame(){

        setTitle("Botones y Eventos");
        setBounds(700, 300, 500, 300);

        ButtonCanvas myButtonCanva = new ButtonCanvas();

        add(myButtonCanva);

    }
    
}


/**
 * ButtonCanvas
 */
class ButtonCanvas extends JPanel {

    /* 
     * Factores del evento:
     *  Evento: click.
     *  Objeto fuente: botonAzul
     *  Objeto receptor (listener): ButtonCanvas
     */
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Aamarillo");
    JButton botonRojo = new JButton("Rojo");

    public ButtonCanvas(){

        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        BackgroundColored Amarillo = new BackgroundColored(Color.YELLOW);
        BackgroundColored Azul = new BackgroundColored(Color.BLUE);
        BackgroundColored Rojo = new BackgroundColored(Color.RED);

        botonAzul.addActionListener(Azul);
        botonAmarillo.addActionListener(Amarillo);
        botonRojo.addActionListener(Rojo);

    }


    /**
     * BackgroundColored
     */
    private class BackgroundColored implements ActionListener {

        private Color colorDeFondo;

        public BackgroundColored(Color c){

            this.colorDeFondo = c;

        }


        public void actionPerformed(ActionEvent e){

            setBackground(colorDeFondo);

        }
        
    }

    
/* 
    public void actionPerformed(ActionEvent e){

        Object buttonPressed = e.getSource();

        if (buttonPressed == botonAzul) {

            setBackground(Color.BLUE);

        } else if (buttonPressed == botonAmarillo){

            setBackground(Color.YELLOW);

        } else {

            setBackground(Color.RED);

        }

    }
 */    

}
