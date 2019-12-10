package oop;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

/**
 * PruebaTempzrInner
 */
public class PruebaTempzrInner {

    public static void main(String[] args) {
        
        // Reloj miReloj = new Reloj(3000, true);
        Reloj miReloj = new Reloj();
        miReloj.enMarcha(3000, true);

        JOptionPane.showMessageDialog(null, "Pulsa OK par aterminar");

        System.exit(0);

    }
    
}


/**
 * InnerPruebaTempzrInner
 */
class Reloj {

    public void enMarcha(int intervalo, final boolean sonido){

        class DameLaHora2 implements ActionListener {

            public void actionPerformed(ActionEvent evento){
    
                Date ahora = new Date();
    
                System.out.println("Hora cada 3 segundos: " + ahora);
    
                if (sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }
    
            }
            
        }

        ActionListener oyente = new DameLaHora2();
        Timer miTemporizador = new Timer(intervalo, oyente);
        miTemporizador.start();

    }

    /* private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido){
        
        this.intervalo = intervalo;
        this.sonido = sonido;

    }

    public void enMarcha(){

        class DameLaHora2 implements ActionListener {

            public void actionPerformed(ActionEvent evento){
    
                Date ahora = new Date();
    
                System.out.println("Hora cada 3 segundos: " + ahora);
    
                if (sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }
    
            }
            
        }

        ActionListener oyente = new DameLaHora2();
        Timer miTemporizador = new Timer(this.intervalo, oyente);
        miTemporizador.start();

    } */


    /* private class DameLaHora2 implements ActionListener {

        public void actionPerformed(ActionEvent evento){

            Date ahora = new Date();

            System.out.println("Hora cada 3 segundos: " + ahora);

            if (sonido) {
                Toolkit.getDefaultToolkit().beep();
            }

        }
        
    } */
    
}