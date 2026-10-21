package Practicas2;
import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.println("Introuzca un numero: ");
	int firstNumber = teclado.nextInt();
	System.out.println("Escriba otro numero");
	int secondNumber= teclado.nextInt();
	
	if (firstNumber>0 && secondNumber>0) {
		System.out.println("Los dos numeros son positivos");
	} else {
		System.out.println("Los dos numeros no son negativos");
	}
	teclado.close();
	}

}
