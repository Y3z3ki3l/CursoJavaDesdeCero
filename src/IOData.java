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
//		System.out.println("Hola " + nombreUsuario + ", el año que viene tendrás " + (edad +1) + " años");
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
//		JOptionPane.showMessageDialog(null, "Hola " + nombreUsusario + ", el proximo año tendrás "
//				+ edadUsuarioInt + " años");
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opción... \n1: Cuadrado \n2: Rectángulo \n3: Triangulo \n4: Círculo");
		int figura = entrada.nextInt();
		
		switch (figura) {
			case 1:
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduc el lado"));
				System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
				break;
				
			case 2:
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				
				System.out.println("El área del rectángulo es: " + (base * altura));
				
				break;
				
			default:
				break;
		}
		
		entrada.close();
	}

}
