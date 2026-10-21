package Practicas2;
import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
	
	Scanner teclado = new Scanner (System.in);
	System.out.println("Escriba un numero para saber si es multiplo de 3: ");
	int numberChoose = teclado.nextInt();
	
	if (numberChoose%3==0) {
		System.out.println("Su numero es multiplo de 3");
	} else {
		System.out.println("Su numero no es multiplo de 3");
	}

	teclado.close();
	}

}
