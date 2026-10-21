package Practicas1;
import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce la longitud en millas: ");
	int millas = teclado.nextInt();
	System.out.println("El resultado en metros es: " +millas*1609);
	teclado.close();
	}

}
