
public class CalculosConMath {

	public static void main(String[] args) {
		
		int num1 = 16;
		double raiz = Math.sqrt(num1);
		System.out.println("La raíz cuadrada de " + num1 + " es: " + raiz);
		
		double base = 5;
		double exponente = 3;
		int pow = (int) Math.pow(base, exponente);
		System.out.println(base + " elevado a potencia " + exponente + ", es: " + pow);
		
		double num3 = 5.46;
		int roundNum = (int) Math.round(num3);
		System.out.println(roundNum);
		
	}

}
