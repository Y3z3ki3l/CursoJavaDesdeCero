import java.text.MessageFormat;

public class Variables {

	public static void main(String[] args) {
		byte edad = 35;
		
		String mensaje1 = String.format("Edad: %s, %s", edad, "mensaje construido con: String.format()");
		String mensaje2 = MessageFormat.format("Edad: {0}, {1}", edad, "mensaje construido con: MessageFormat.format()");
		System.out.println(mensaje1);
		System.out.println(mensaje2);
		System.out.println("Current Time milliseconds: " + System.currentTimeMillis());
		
		/**
		 * Constants		
		 */
		final double A_PULGADAS = 2.54;
		
		/**
		 * Operands
		 * Arithmetic: +, -, *, /, %
		 * 
		 * Logic, relational and boolean:
		 * >, <, <>, !=, ==, &&, ||
		 */
		
	}

}
