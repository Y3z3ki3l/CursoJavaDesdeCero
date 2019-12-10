import java.util.*;

import javax.swing.JOptionPane;

public class IOData {

	public static void main(String[] args) {
		
		/**
		 * Using Scanner class
		 */
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Introduce tu nombre:");
//		String nombreUsuario = entrada.nextLine();		
//		
//		System.out.println("Introduce tu edad:");
//		int edad = entrada.nextInt();
//		
//		System.out.println("Hola " + nombreUsuario + ", el a�o que viene tendr�s " + (edad +1) + " a�os");
//		
//		entrada.close();
		
		
		/**
		 * Usign JOptionPane
		 */
//		String nombreUsusario = JOptionPane.showInputDialog("Introduce tu nombre:");
//		String edadUsuario = JOptionPane.showInputDialog("Introduce tu edad: ");
//		
//		int edadUsuarioInt = Integer.parseInt(edadUsuario);
//		edadUsuarioInt++;
//		JOptionPane.showMessageDialog(null, "Hola " + nombreUsusario + ", el proximo a�o tendr�s "
//				+ edadUsuarioInt + " a�os");
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opci�n... \n1: Cuadrado \n2: Rect�ngulo \n3: Triangulo \n4: C�rculo");
		int figura = entrada.nextInt();
		
		switch (figura) {
			case 1:
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduc el lado"));
				System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
				break;
				
			case 2:
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				
				System.out.println("El �rea del rect�ngulo es: " + (base * altura));
				
				break;
				
			default:
				break;
		}
		
		entrada.close();
	}

}
