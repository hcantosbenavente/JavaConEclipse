package Prueba_inicial;
import java.util.Scanner;
public class Ejercicio_3 {

	public static void main(String[] args) {
		//Hugo Cantos Benavente
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero entero positivo");
		int numero1=teclado.nextInt();
		
		for(int i=1;i<=numero1;i++) {
			if (i%2==0) {
				System.out.println(i +" - par");
			} else {
				System.out.println(i + " - impar");
			}
		}
		
		teclado.close();
		
	}
}