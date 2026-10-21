package Practicas1;
import java.util.Scanner;
public class Ejercicio_3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Escriba la temperatura en grados Cº: ");
	float temperatura=teclado.nextFloat();
	System.out.println("La temperatura en Fahrenheit es: " +((9*temperatura/5) + 32));
	teclado.close();
	}

}
