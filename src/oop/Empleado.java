package oop;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona implements Comparable, Trabajadores {
	
	private Double sueldo = 0.0;
	private Date altaContrato ;
	private int idEmpleado;
	private static int idSiguiente;
	
	public Empleado(String nombre, Double sueldo, int agno, int mes, int dia) {
		
		super(nombre);
		
		this.sueldo = sueldo;
		GregorianCalendar date_time = new GregorianCalendar(agno, mes-1, dia);
		this.altaContrato = date_time.getTime();
		++idSiguiente;
		idEmpleado = idSiguiente;
		
	}
	
	public String getDescription() {
		return "Este empleado tiene un Id:      " + this.getIdEmpleado()
				+ "\nSu sueldo es de:           " + String.format("%.2f", this.getSueldo())
				+ "\nSu fecha de ingreso fue:   " + this.getAltaContrato();
	}
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if (this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}
		
		if(this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;
		
	}

	public double establece_bonus(double bonus){

		return Trabajadores.bonus_base + bonus;

	}
	
	/*
	public Empleado(String nombre, Double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	*/
	
	/*
	public Empleado(String nombre) {
//		this.nombre = nombre;
		this(nombre, 8000.0, 2000, 01, 01);
	}
	*/
	
	/*
	public String getNombre() {
		return this.nombre;
	}
	*/
	
	public Double getSueldo() {
		return this.sueldo;
	}
	
	public Date getAltaContrato() {
		return this.altaContrato;
	}
	
	public void aumentaSueldo(Double porcentaje) {
		
//		Double aumento = this.sueldo * porcentaje/100;
//		this.sueldo += aumento;
		this.sueldo = this.sueldo * (1 + porcentaje/100);
		
	}
	
	public int getIdEmpleado() {
		return this.idEmpleado;
	}

}
