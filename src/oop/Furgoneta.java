package oop;

public class Furgoneta extends Coche {
	
	private int plazas_extra;
	private int capacidad_carga; 
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		
		super();	//llama al constructor de la clase padre (Automovil)
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
		
	}
	
	public int getPlazasExtra() {
		return this.plazas_extra;
	}
	
	public int getCapacidadCarga() {
		return this.capacidad_carga;
	}
	
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es: " + this.capacidad_carga + "Y las plazas extra son: " + this.plazas_extra;
	}

}
