package oop;

public class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nombre, String carrera) {
		
		super(nombre);
		this.carrera = carrera;
		
	}
	
	public String getDescription() {
		
		return "Este alumno estudia la carrera de:	" + this.carrera;
		
	}

}
