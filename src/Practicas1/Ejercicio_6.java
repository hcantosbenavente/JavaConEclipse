package Practicas1;
import java.util.Scanner;
public class Ejercicio_6 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduzca su año de nazimiento: ");
	short fechaNacimiento=teclado.nextShort();
	System.out.println("Introduzca el año actual: ");
	short fechaActual=teclado.nextShort();
	System.out.println("Su edad actual es: " +(fechaActual-fechaNacimiento));
	teclado.close();
	}

}
