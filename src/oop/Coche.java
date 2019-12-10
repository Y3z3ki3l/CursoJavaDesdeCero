package oop;

public class Coche {
	
	private int tires;
	private int length;
	private int wide;
	private int engine;
	private int platform_weigth;
	
	private String color;
	private int finalWeight;
	private boolean leatherSits, airConditioner;
	
	public Coche() {
		
		tires = 4;
		length = 2000;
		wide = 300;
		engine = 1600;
		platform_weigth = 500;
		
	}

	/**
	 * @return the tires
	 */
	public int getTires() {
		return tires;
	}

	/**
	 * @return the length
	 */
	public String getLength() {
		return "El largo del automovil es: " + length + " cm.";
	}

	/**
	 * @return the wide
	 */
	public int getWide() {
		return wide;
	}

	/**
	 * @return the engine
	 */
	public int getEngine() {
		return engine;
	}

	/**
	 * @return the weight
	 */
	public int getPlatformWeight() {
		return platform_weigth;
	}
	
	/**
	 * @return the all common platform data
	 */
	public String getPlatformData() {
		
		return "Caracterísitcas comunes de la plataforma para " 
				+ "todos los vehículos" 
				+ "\nRuedas: 			" + tires
				+ "\nLength: 			" + length/1000 + " metros"
				+ "\nWide:				" + wide + " cm"
				+ "\nEngine:			" + engine
				+ "\nPlatform weigth:	" + platform_weigth + " Kg";
	}
	
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return "El color del automovil es: " + color;
	}

	/**
	 * @return the finalWeight
	 */
	public String getFinalWeight() {
		
		int peso_carroceria = 500;
		
		finalWeight = platform_weigth + peso_carroceria;
		
		if (leatherSits == true) {
			finalWeight = finalWeight + 50;
		}
		
		if (airConditioner == true) {
			finalWeight = finalWeight + 20;
		}
		
		return "El peso total del auto es: " + finalWeight;
	}

	/**
	 * @param finalWeight the finalWeight to set
	 */
	public void setFinalWeight(int finalWeight) {
		this.finalWeight = finalWeight;
	}
	

	public String isLeatherSits() {
		
		if (leatherSits) {
			
			return "El auto tiene asientos de piel";
			
		} else {
			
			return "El auto tiene asientos de serie";
			
		}

	}
	

	public void setLeatherSits(String leatherSits) {
		
		if (leatherSits.equalsIgnoreCase("si")) {
			this.leatherSits = true;
		} else {
			this.leatherSits = false;
		}
		
	}
	
	
	public String isAirConditioner() {
		
		if (airConditioner) {
			
			return "El auto tiene Aire Acondicionado";
			
		} else {
			
			return "El auto NO tiene Aire Acondicionado";
			
		}

	}
	

	public void setAirConditioner(String airConditioner) {
		
		if (airConditioner.equalsIgnoreCase("si")) {
			this.airConditioner = true;
		} else {
			this.airConditioner = false;
		}
		
	}
	
	
	public int precioFinal() {
		
		int precioFinal = 10000;
		
		if (leatherSits == true) {
			precioFinal += 2000;
		}
		
		if (airConditioner == true) {
			precioFinal += 1500;
		}
		
		return precioFinal;
		
	}
	
}
