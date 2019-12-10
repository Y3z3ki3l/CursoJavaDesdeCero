import java.util.Locale;
import java.util.Scanner;

public class ManipulaCadenas {

	public static void main(String[] args) {
		
		String nombre = "Carlos Chavez Jaramillo";
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Mi nombre tiene: " + nombre.length() + " letras de longitud");
		System.out.println("La primer letra de mi nombre es: " + nombre.charAt(0));
		
		int ultimaLetra = nombre.length() - 1;
		System.out.println("La ultima letra de mi nombre es: " + nombre.charAt(ultimaLetra));
		
		String frase = "Hoy es un estupendo día para aprender a programar en Java";
//		String fraseResumen = frase.substring(29, frase.length());
		String fraseResumen = frase.substring(0, 29) + "irnos a playa y olvidarnos de todo... y "
				+ frase.substring(29, 57);
		System.out.println("Frase original: " + frase);
		System.out.println("Frase recortada: " + fraseResumen);
		
		String alumno1, alumno2;
		
		alumno1 = "David";
		alumno2 = "david";
		
		System.out.println("Comparando cadenas de carácteres...");
		System.out.println("Resultado con equals(): " + alumno1.equals(alumno2));
		System.out.println("Resultado con equalsIgnoreCase(): " + alumno1.equalsIgnoreCase(alumno2));
		
		Scanner myScanner;
		Locale myLocale;
		
	}

}
