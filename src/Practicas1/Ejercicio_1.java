package Practicas1;
import java.util.Scanner;
public class Ejercicio_1 {

	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero");
		int primerNumero=teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		int segundoNumero=teclado.nextInt();
		
		System.out.println("La suma de los dos numeros es: " +(primerNumero+segundoNumero));
		System.out.println("La resta de los dos numeros es: " +(primerNumero-segundoNumero));
		System.out.println("La multiplicacion de los dos numeros es: " +(primerNumero*segundoNumero));
		System.out.println("La division de los dos numeros es: " +(primerNumero/segundoNumero));
		teclado.close();
	}

}
