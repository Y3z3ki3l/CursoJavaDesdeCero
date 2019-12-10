import java.util.*;

import javax.swing.JOptionPane;

public class EmailValidator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String email = "";
		boolean validArroba = false;
		
		while (validArroba == false) {
			
			email = JOptionPane.showInputDialog("Ingresa tu email: ");
			
			validArroba = validEmail(email);
			
		}
		
		input.close();
		
	}


	/**
	 * Metodo que valida si el string introducido contiene arroba y que sea sólo una
	 * @param String email
	 * @return boolean arrobaValid
	 */
	private static boolean validEmail(String email) {
		
		int arroba = 0;
		boolean arrobaValid = false;
		boolean punto = false;
		
		for (int i = 0; i < email.length(); i++) {
			
			if (email.charAt(i) == '@') {
				arroba++;
			}
			
			if (email.charAt(i) == '.') {
				punto=true;
			}
			
		}
		
		if (arroba == 1 && punto == true) {
			arrobaValid = true;
			System.out.println("Email valido");
		}
		else {
			System.out.println("Email NO valido: " + email);
		}
		
		return arrobaValid;
		
	}
	

//	/**
//	 * Metodo que valida si existe mas de un arroba
//	 * @param String emailToValid
//	 * @return boolean numArrobasValid
//	 */
//	public static boolean validNumArroba(String emailToValid)
//	{
//		
//		int numArrobas = 0;
//		boolean numArrobasValid;
//		
//		for (int i = 0; i < emailToValid.length(); i++) {
//			
//			if (emailToValid.charAt(i) == '@') {
//				numArrobas++;
//			}
//			
//		}
//		
//		if (numArrobas > 1) {
//			numArrobasValid = false;
//			System.out.println("Segunda validación fallida, contiene más de un @...");
//		}
//		else {
//			numArrobasValid = true;
//			System.out.println("Segunda validación OK, contiene sólo un @ \nEmail correecto!");
//		}
//		
//		return numArrobasValid;
//		
//	}

}
