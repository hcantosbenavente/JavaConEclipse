package Practicas1;
import java.util.Scanner;
public class Ejercicio_4 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	System.out.println("Inrtoduce la base del triangulo: ");
	int base = teclado.nextInt();
	System.out.println("Introduce la altura del triangulo");
	int altura = teclado.nextInt();
	System.out.println("La superficie del triangulo es: " +base*altura/2);
	teclado.close();
	}

}
