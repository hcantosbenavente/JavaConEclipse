package Practicas2;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduzca un numero: ");
	int number1 = teclado.nextInt();
	
	if (number1%2==0) {
		System.out.println("Su numero es par");
	} else {
		System.out.println("Su numero es impar");
	}

	teclado.close();
	
	}

}
