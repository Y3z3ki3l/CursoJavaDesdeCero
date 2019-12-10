package oop;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * MiTemporizador
 */
public class PruebaTemporizador {

    public static void main(String[] args) {

        //ActionListener oyente = new DameLaHora(); 
        DameLaHora oyente = new DameLaHora();

        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa OK para detener...");

        System.exit(0);

    }
    
}