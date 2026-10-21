package Prueba_inicial;
import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
		//Hugo Cantos Benavente
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero del 0-10");
		int nota = teclado.nextInt();
		
		if (nota<0||nota>10) {
			System.out.println("Nota introducida incorrectamente");
		} else if (nota<5) {
			System.out.println("Has suspendido");
		} else if (nota>=5&&nota<6) {
			System.out.println("Has aprobado");
		} else if (nota>=6&&nota<7) {
			System.out.println("Lo has hecho bien");
		} else if (nota>=7&&nota<9) {
			System.out.println("Has conseguido un notable");
		} else if (nota>=9&&nota<=10) {
			System.out.println("Excelente has sacado un sobresaliente");
		}
		
		teclado.close();
		
	}

}
