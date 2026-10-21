package Practicas2;
import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	System.out.println("Escriba un numero: ");
	int primerNumero = teclado.nextInt();
	System.out.println("Escribe otro numero: ");
	int segundoNumero = teclado.nextInt();
	
	if ((primerNumero>0 || segundoNumero>0) && (primerNumero>0 && segundoNumero>0)) {
		System.out.println("Ambos numeros son positivos");
	}else if ((primerNumero>0 || segundoNumero>0) && primerNumero>0){
		System.out.println("El primer numero es positivo");
	} else if ((primerNumero>0 || segundoNumero>0) && segundoNumero>0){
	 System.out.println("El segundo numero es positivo");
	}
	teclado.close();
	}

}
