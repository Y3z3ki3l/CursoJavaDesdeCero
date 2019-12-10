import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int randNum = (int) (Math.random() * 100);
		int numero = 0;
		int intentos = 0;
		
//		System.out.println("El numero aleatorio es: " + randNum);
		
		/**
		 * Using while
		 */
//		while (numero != randNum) {
//			
//			intentos++;
//			System.out.println("Introduce un numero: ");
//			numero = input.nextInt();
//			
//			if (randNum < numero) {
//				System.out.println("Introduce un numero más bajo");
//			}
//			else if (randNum > numero) {
//				System.out.println("Introduce un numero más alto");
//			}
//			
//		}
		
		/**
		 * Using do-while
		 */
		do {
			
			intentos++;
			System.out.println("Introduce un numero: ");
			numero = input.nextInt();
			
			if (randNum < numero) {
				System.out.println("Introduce un numero más bajo");
			}
			else if (randNum > numero) {
				System.out.println("Introduce un numero más alto");
			}
			
		} while (numero != randNum);
		
		System.out.println("Felicidades! Lo lograste en " + intentos + " intentos");
		
	}

}
