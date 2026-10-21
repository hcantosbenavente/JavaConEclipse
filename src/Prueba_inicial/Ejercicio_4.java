package Prueba_inicial;
import java.util.Scanner;
public class Ejercicio_4 {

	public static void main(String[] args) {
		// Hugo Cantos Benavente
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba un numero en pantalla");
		int contador=0, numeros, suma=0, contadorNegativo=0, contadorPositivo=0;
		numeros = teclado.nextInt();
		
		while (numeros!=0) {
			contador++;
			if (numeros<0) {
				contadorNegativo++;
			} else if (numeros>0) {
				contadorPositivo++;
			}
			
			suma=numeros + suma;
			System.out.println("introduzca otro numero");
			numeros=teclado.nextInt();
		}
		System.out.println("La cifra total es: " + suma);
		System.out.println("Has introducido un total de: " +contador +" numeros" );
		System.out.println("Positivos: " +contadorPositivo);
		System.out.println("Negativo: " +contadorNegativo);
		
		teclado.close();

	}

}
