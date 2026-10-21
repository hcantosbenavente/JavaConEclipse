package Practicas3;
import java.util.Scanner;
public class Ejercicio6_3_11 {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba un numero en pantalla");
		int contador=0, numeros, suma=0;
		numeros = teclado.nextInt();
		
		while (numeros!=0) {
			contador++;
			suma=numeros + suma;
			System.out.println("introduzca otro numero");
			numeros=teclado.nextInt();
		}
		System.out.println("La cifra total es: " + suma);
		System.out.println("Has introducido un total de: " +contador +" numeros" );
		
		teclado.close();
	}
}
