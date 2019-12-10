package oop;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

/**
 * DameLaHora
 */
public class DameLaHora implements ActionListener {

    public void actionPerformed(ActionEvent e){

        Date ahora = new Date();

        System.out.println("La hora es: " + ahora);

        Toolkit.getDefaultToolkit().beep();

    }

}