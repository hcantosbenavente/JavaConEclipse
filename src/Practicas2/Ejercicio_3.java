package Practicas2;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	
	System.out.println("Escriba el primer numero:");
	int firstNumber=teclado.nextInt();
	
	System.out.println("Escriba el segundo numero:");
	int secondNumber=teclado.nextInt();
	
	if (firstNumber<secondNumber) {
		System.out.println("El segundo numero es mayor");
	} else if (firstNumber>secondNumber) {
		System.out.println("El primer numero es mayor");
	} else if (firstNumber==secondNumber) {
		System.out.println("Los dos numeros son iguales");
	}
	teclado.close();
	}

}
