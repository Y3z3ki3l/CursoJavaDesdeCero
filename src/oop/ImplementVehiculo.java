package oop;

import javax.swing.JOptionPane;

public class ImplementVehiculo {

	public static void main(String[] args) {
		
		Coche Renault = new Coche();
		Coche Citroen = new Coche();
		
//		Renault.tires = 8;
		
//		System.out.println("Este automovil tiene: " + Renault.length + " llantas.");
//		System.out.println("Este automovil tiene: " + Citroen.length + " llantas.");
		
		System.out.println(Renault.getLength());
		
		Renault.setColor(JOptionPane.showInputDialog("Introduce color: "));
//		Renault.color = "Rojo";
		
		System.out.println(Renault.getColor());
		
		System.out.println("Reaneult data: " + Renault.getPlatformData());
		System.out.println("Citroen data: " + Citroen.getPlatformData());
		
		Renault.setLeatherSits(JOptionPane.showInputDialog("¿Asientos de cuero?"));
		System.out.println(Renault.isLeatherSits());
		
		Renault.setAirConditioner(JOptionPane.showInputDialog("¿Aire Acondicionado?"));
		System.out.println(Renault.isAirConditioner());
		
		System.out.println(Renault.getFinalWeight());
		System.out.println("El precio final del auto es: " + Renault.precioFinal());
		
	}

}
