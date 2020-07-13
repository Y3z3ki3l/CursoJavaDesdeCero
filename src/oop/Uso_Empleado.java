package oop;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		/*
		Empleado empleado1 = new Empleado("Franz Ezequiel Mu�oz Gutierrez", 10000.00, 2019, 10, 9);
		
		System.out.println("Informaci�n del empleado"
				+ "\nNombre:				" + empleado1.getNombre()
				+ "\nSueldo:				" + empleado1.getSueldo()
				+ "\nFecha de ingreso:		" + empleado1.getAltaContrato());
		
		System.out.println("Aumentar sueldo...");
		empleado1.aumentaSueldo(15.0);
		
		System.out.println("Informaci�n del empleado actualizada..."
				+ "\nNombre:				" + empleado1.getNombre()
				+ "\nSueldo:				" + empleado1.getSueldo()
				+ "\nFecha de ingreso:		" + empleado1.getAltaContrato());
		*/
		
		Jefatura jefe_RRHH = new Jefatura("Herby", 20000.00, 2019, 12, 03);
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[5];
		
		misEmpleados[0] = new Empleado("Franz Muñoz", 10000.00, 2019, 10, 9);
		misEmpleados[1] = new Empleado("Coco Ramos", 11000.00, 2019, 03, 21);
		misEmpleados[2] = new Empleado("Niko Muñoz", 12000.00, 2017, 10, 27);
		// misEmpleados[3] = new Empleado("Alonso Mu�oz");
		misEmpleados[3] = jefe_RRHH;	//Polimorfismo en accion. Principio de sustituci�n
		
		misEmpleados[4] = new Jefatura("Ana Mar�a", 25000.00, 2014, 03, 01);
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[4];
		jefa_Finanzas.estableceIncentivo(55000);

		
		// Usando instanceof
		/* 
		Empleado director_comercial = new Jefatura("Sandra", 85000.00, 2012, 05, 05);
		Comparable is_comparable = new Empleado("Elizabeth", 95000.00, 2011, 06, 07);
		
		if (director_comercial instanceof Empleado) {
			
			System.out.println(director_comercial.getNombre() + " es una instancia de tipo Jefatura");
			
		}
		
		if (is_comparable instanceof Comparable) {
			
			System.out.println("Implementa la interface Comparable");
			
		}
		 */
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas días de vacaciones"
				+ " a los empleados"));

		System.out.println("El jefe " + jefa_Finanzas.getNombre() + " tiene un bono de: " + jefa_Finanzas.establece_bonus(500));

		System.out.println(misEmpleados[2].getNombre() + " tiene un bonus de: " 
			+ misEmpleados[2].establece_bonus(200));
		
		for (Empleado empleado : misEmpleados) {
		/* 	
			System.out.println("Informaci�n del empleado"
					+ "\nNombre:				" + empleado.getNombre()
					+ "\nSueldo:				" + String.format("%.2f", empleado.getSueldo())
					+ "\nFecha de ingreso:		" + empleado.getAltaContrato());
			
			System.out.println("Aumentar sueldo...");
			 */
			empleado.aumentaSueldo(15.0);
			
		}
		
		Arrays.sort(misEmpleados);
		
		System.out.println("Información los empleados...");
		
		for (Empleado e : misEmpleados) {
			
			System.out.println("\nId Empleado:  " + e.getIdEmpleado()
					+ "\nNombre:                " + e.getNombre()
					+ "\nSueldo:                " + String.format("%.2f", e.getSueldo())
					+ "\nFecha de ingreso:      " + e.getAltaContrato());
			
		}
		
	}

}


class Jefatura extends Empleado implements Jefes{
	
	private double incentivo;
	
	public Jefatura(String nombre, double sueldo, int agno, int mes, int dia) {
		super(nombre, sueldo, agno, mes, dia);
	}
	
	public void estableceIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public Double getSueldo() {
		
		Double sueldoJefe = super.getSueldo();
		
		return sueldoJefe + this.incentivo;
				
	}
	
	public String tomar_decisiones(String decision) {
		
		return "La decisión tomada por el jefe es: " + decision;
		
	}

	public double establece_bonus(double bonus){

		double prima = 500;

		return Trabajadores.bonus_base + bonus + prima;
	}
	
}
