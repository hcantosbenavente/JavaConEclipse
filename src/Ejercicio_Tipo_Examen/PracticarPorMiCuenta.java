package Ejercicio_Tipo_Examen;
import java.util.Scanner;
import java.util.ArrayList;
public class PracticarPorMiCuenta {
	
	int userOption;
	static int welcomeOption;
	static String user;
	static String password;
	static int contadorAraays;
	
//	Metodo para llamar al menu cada vez que querarmos
	
	public static void welcomeMenu() {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("----------!Bienvenido a nuestra aerolinea¡----------");
		System.out.println();
		System.out.println("Porfavor cree un usuariovo inicie sesion en caso de que ya tenga un usuario registrado");
		System.out.println();
		System.out.println("1) Iniciar sesion");
		System.out.println("2) Registrarse");
		System.out.println();
		System.out.print("Ingrese una opcion: ");
		welcomeOption=teclado.nextInt();
		
		String users[]= new String[100];
		String passwords [] = new String [100];
		
		switch (welcomeOption) {
		
			case 1: {
				
				System.out.println("Introduzca los datos");
				System.out.println();
				System.out.print("Usuario: ");
				user = teclado.next();
				System.out.println();
				System.out.print("Contraseña: ");
				password = teclado.next();
				
				for (int x=0;x<users.length;x++) {
					if (users(x) == user && passwords(x)==password) {
						System.out.println("Has accedido correctamente al sistema");
					}
				}
				
				contadorAraays++;
				
			}
		
			case 2: {
			
				System.out.println("Introduzca los datos");
				System.out.println();
				System.out.print("Usuario: ");
				user = teclado.next();
				System.out.println();
				System.out.print("Contraseña: ");
				password = teclado.next();
				
				
				
				break;
				
			}
		
		}
		
	}
	
	private static String users(int x) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String passwords(int x) {
	// TODO Auto-generated method stub
	return null;
}

	public static void main(String[] args) {	
		Scanner teclado = new Scanner(System.in);
			
		welcomeMenu();
		
		
	}

}
