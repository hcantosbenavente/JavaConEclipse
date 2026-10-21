package Practicas1;
import java.util.Scanner;
public class Ejercicio_7 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.println("Escribe un numero real: ");
	double primerNumero=teclado.nextDouble();
	System.out.println("Escribe el segundo numero real: ");
	double segundoNumero = teclado.nextDouble();
	float resultado = (float) (primerNumero/segundoNumero);
	System.out.println("El resultado de la division es: " +resultado);
	teclado.close();
	}

}
