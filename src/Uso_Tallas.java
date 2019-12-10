import java.util.Scanner;

public class Uso_Tallas {

//	enum Talla	{CHICA, MEDIANA, GRANDE, EXTGRANDE}
	
	enum Talla{
		
		CHICA("S"), MEDIANA("M"), GRANDE("L"), EXTGRANDE("XL");
		
		private String abreviatura;
		
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String getAbreviatura() {
			return this.abreviatura;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Talla s = Talla.CHICA;
		Talla m = Talla.MEDIANA;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.EXTRAGRANDE;
		
		System.out.println("Talla s: " + s);
		System.out.println("Talla m: " + m);
		System.out.println("Talla l: " + l);
		System.out.println("Talla xl: " + xl);
		*/
		
		Scanner usrInput = new Scanner(System.in);
		
		System.out.println("Escribe una talla:"
				+ "\nCHICA"
				+ "\nMEDIANA"
				+ "\nGRANDE"
				+ "\nEXTGRANDE");
		
		String inputLine = usrInput.next().toUpperCase();
		
		Talla laTalla = Enum.valueOf(Talla.class, inputLine);
		
		System.out.println("Talla seleccionada:	" + laTalla + " "
				+ "\nAbreviatura:		" + laTalla.getAbreviatura());

	}

}
