package Practicas3;
import java.util.Scanner;
public class Ejercicio6_1_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		int numero1=teclado.nextInt();

		while (numero1!=0) {
			System.out.println("Eel cuadrado de su numero es: " +(numero1*numero1));
			System.out.println("Introduzca otro numero: ");
			numero1 = teclado.nextInt();
		}
		teclado.close();
	}

}
