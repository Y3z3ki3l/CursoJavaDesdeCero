import java.math.BigInteger;

import javax.swing.JOptionPane;

public class UsginForLoop {

	public static void main(String[] args) {
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Mi nombre es: Franz Ezequiel Muñoz Gutierrez");
//		}
		
//		long resultado = 1;
//		
//		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
//		
//		for (int i = numero; i > 0; i--) {
//			resultado *= i;
//		}
//		
//		System.out.println("El factorial de " + numero + ", es: " + resultado);
		
		
		/**
		 * Declarando un array
		 */
//		int[] mi_matriz = {15,25,8,-7,92};
////		mi_matriz[0] = 15;
//		
//		System.out.println("Using for loop to iterate an array");
//		for (int i = 0; i < mi_matriz.length; i++) {
//			
//			if ( i == mi_matriz.length -1 ) {
//				System.out.print(mi_matriz[i]);
//			}
//			else {
//				System.out.print(mi_matriz[i] + ", ");
//			}
//			
//		}
//		
//		System.out.println("\nUsing for-each loop to iterate an array");
//		for (int num : mi_matriz) {
//			
//			System.out.print(num + " ");
//			
//		}
		
		
		/**
		 * Declarando un array 2D
		 */
//		int[][] myNumbers = {{1,2,3,4}, {4,3,2,1}, {0,9,8,7}, {7,8,9,0}};
		int[][] myNumbers = new int[4][5];
		
//		System.out.println(myNumbers[3][1]);
		
		for ( int[] row : myNumbers) {
			for (int element : row) {
				element = (int) (Math.random() * 100);
				System.out.print(element + " ");
			}
			
			System.out.print("\n");
		}
		
	}

}
