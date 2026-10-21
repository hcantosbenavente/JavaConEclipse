package Practicas2;
import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escriba el numero 12");
		int numberChoose = teclado.nextInt();
		
		if (numberChoose != 12) {
			System.out.println("El numero elegido no es 12");
		}
	teclado.close();
	}

}
