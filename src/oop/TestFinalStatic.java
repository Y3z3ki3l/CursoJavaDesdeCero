package oop;

public class TestFinalStatic {

	public static void main(String[] args) {
		
		Empleados empleado1 = new Empleados("Franz Muñoz");
		Empleados empleado2 = new Empleados("Coco Ramos");
		Empleados empleado3 = new Empleados("Niko Muñoz");
		Empleados empleado4 = new Empleados("Alonso Muñoz");
		
		empleado1.cambiaSeccion("Software Development");
		empleado2.cambiaSeccion("Relaciones Laborales");
		
		System.out.println(empleado1.devuelveDatos());
		System.out.println(empleado2.devuelveDatos());
		System.out.println(empleado3.devuelveDatos());
		System.out.println(empleado4.devuelveDatos());
		
		System.out.println("Nex Id: " + Empleados.getNextId());
		
	}

}


class Empleados{
	
	private final String NOMBRE;
	private String seccion;
	public int id;
	
	private static int nextId = 1;
	
	public Empleados(String nombre) {
		
		this.NOMBRE = nombre;
		this.seccion = "Administración";
		id = nextId;
		nextId++;
		
	}
	
	public void cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String devuelveDatos() {
		return "Nombre empleado:	" + this.NOMBRE
				+ "\nSeccion:		" + this.seccion
				+ "\nId:			" + this.id;
	}
	
//	public void cambiarNombre(String nombre) {
//		this.nombre = nombre;
//	}
	
	public static int getNextId() {
		return nextId;
	}
	
}