package Clases;

public class Minimo {

	public static int Minimo(int num1, int num2) throws IllegalArgumentException {
		
	if (num1 >0 && num2 > 0 ) {
		throw new IllegalArgumentException("un numerpo es menor que 0");
		
	}else if(num1 < num2) {
		throw new IllegalArgumentException("un numero 1 es menor");
		
	}else if(num1 > num2) {
		
		throw new IllegalArgumentException("un numero2 es menor");
	}
	return num2+num1;
	
}
}
