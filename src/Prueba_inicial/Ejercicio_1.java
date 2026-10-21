package Prueba_inicial;
import java.util.Scanner;
public class Ejercicio_1 {

	public static void main(String[] args) {
		//Hugo Cantos Benavente
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su edad:");
		int edad = teclado.nextInt();
		
		System.out.println("Introduzca las horas de sueño: ");
		int sleepTime = teclado.nextInt();
		
		System.out.println("Hola, Ana.");
		System.out.println("Tienes " +edad +" años");
		System.out.println("Duermes aproximadamente " +(sleepTime * 7) +" a la semana");
		
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Para llegar a los 18 te faltan " +(18-edad) +" años");
		}
		
		teclado.close();

	}

}
