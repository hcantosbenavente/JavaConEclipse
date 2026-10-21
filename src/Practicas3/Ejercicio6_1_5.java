package Practicas3;
import java.util.Scanner;
public class Ejercicio6_1_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba la contraseña 1234: ");
		int password=teclado.nextInt();

		while (password!=1234) {
			System.out.println("La contraseña es incorrecta");
			System.out.println("Introduzca otro numero: ");
			password = teclado.nextInt();
		}
		System.out.println("La contraseña es correcta");
		teclado.close();
	}

}