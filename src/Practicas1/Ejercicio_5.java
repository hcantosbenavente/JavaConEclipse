package Practicas1;
import java.util.Scanner;
public class Ejercicio_5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduzca un numero: ");
	byte primerNumero = teclado.nextByte();
	System.out.println("Introduzca el segundo numero");
	byte segundoNumero = teclado.nextByte();
	byte resultado = (byte) (primerNumero+segundoNumero);
	System.out.println("La suma de los dos numeros es: " +resultado);
	teclado.close();
	}

}
