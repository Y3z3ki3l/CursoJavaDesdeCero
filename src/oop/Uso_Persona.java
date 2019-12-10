package oop;

public class Uso_Persona {

	public static void main(String[] args) {
		
		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado("Niko Muñoz", 25680.00, 2017, 10, 27);
		lasPersonas[1] = new Alumno("Alonso Muñoz", "Cibernetica");
		
		for (Persona persona : lasPersonas) {
			System.out.println(persona.getNombre() 
					+ "\n" + persona.getDescription());
		}

	}

}
