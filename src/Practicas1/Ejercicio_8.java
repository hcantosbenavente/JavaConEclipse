package Practicas1;
import java.util.Scanner;
public class Ejercicio_8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca una longitud en millas: ");
		int millas = teclado.nextInt();
		System.out.println("El resultado en kilometros es: " +(millas*1.609));
		teclado.close();
	}

}
