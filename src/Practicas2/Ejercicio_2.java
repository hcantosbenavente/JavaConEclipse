package Practicas2;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un numero:");
		int numberChoose = teclado.nextInt();
		
		if (numberChoose>0) {
			System.out.println("Su numero es mayor a 0");
		} else if (numberChoose<0) {
			System.out.println("Su numero es menor a 0");
		} else if (numberChoose==0) {
			System.out.println("Su numero es 0");
		}
	teclado.close();
	}

}
