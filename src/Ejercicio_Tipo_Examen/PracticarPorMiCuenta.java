package Ejercicio_Tipo_Examen;
import java.util.Scanner;
import java.util.Random;
public class PracticarPorMiCuenta {
	
	int userOption;
	static int welcomeOption;
	static String user;
	static String password;
	static int contadorAraays=0;
	static boolean login = false;
	static boolean access=false;
	static Scanner teclado=new Scanner(System.in);
	static int airOption;
	static boolean exit = false;
	
//	Estas variables estaban dentro del main, ahora son static para poder usarlas en los metodos
	static Random generador = new Random();
	static String users[]= new String[100];
	static String passwords [] = new String [100];
	static String flights [] = new String [100];
	static double flightsPrices [] = new double [100];
	static int flightsCounted=0;
//=====================================================	
//	                     MENUS						 =
//=====================================================
	
//	Metodo para llamar al menu cada vez que querarmos
	
	public static void welcomeMenu() {
		System.out.println("----------!Bienvenido a nuestra aerolinea¡----------");
		System.out.println();
		System.out.println("Por favor cree un usuario, inicie sesion en caso de que ya tenga un usuario registrado");
		System.out.println();
		System.out.println("1) Iniciar sesion");
		System.out.println("2) Registrarse");
		System.out.println();
		System.out.print("Ingrese una opcion: ");
		welcomeOption=teclado.nextInt();	
		
	}
	
//	Metodo para seleccionar la opcion desdes de iniciar sesion en las aerolineas
	
	public static void airMenu () {
		System.out.println("----------!Bienvenido a nuestra aerolinea¡----------");
		System.out.println();
		System.out.println("0) Cerrar Sesion");
		System.out.println("1) Agregar vuelo");
		System.out.println("2) Eliminar vuelo");
		System.out.println("3) Ver vuelos");
		System.out.println();
		System.out.print("Inserte una opcion: ");
		airOption=teclado.nextInt();
		
	}
	
//==============================================
//				INICIO DE SESION			   	  =
//==============================================
	
//	Metodo del case 1 del login: iniciar sesion
	
	public static void iniciarSesion() {
		
		access=false;
		
		System.out.println("Introduzca los datos");
		System.out.println();
		System.out.print("\nUsuario: ");
		user = teclado.next();
		System.out.print("Contraseña: ");
		password = teclado.next();
		
		for (int x=0;x<contadorAraays;x++) {
			if (users[x].equals(user) && passwords[x].equals(password)) {
				access=true;
			}
		}
		
		if (access==true) {
			System.out.println("Has accedido correctamente al sistema");
			System.out.println();
			login=true;
		} else {
			System.out.println();
			System.out.println("Contraseña o usuarios incorrectos");
			System.out.println("----------------------------------");
			System.out.println("1) Iniciar sesion");
			System.out.println("2) Registrarse");
			welcomeOption=teclado.nextInt();
			
		}
		
	}
	
//	Metodo del case 2 del login: registrarse
	
	public static void registrarse() {
		
//		Aqui nos vamos a registrar 
		
		System.out.println("Introduzca los datos");
		System.out.println();
		System.out.print("\nUsuario: ");
		user = teclado.next();
		System.out.print("Contraseña: ");
		password = teclado.next();
		
//		contadorAraays sirve para saber cuantos usuarios emos introducido y asi no leer mas casillas de las que necesitamos evitando errores
		
		users[contadorAraays]=user;
		passwords [contadorAraays]=password;
		
		System.out.println();
		System.out.println("Ya te has registrado, ahora inicie sesion");
		System.out.println();
		
		contadorAraays++;
		welcomeOption=1;
		
	}
	
//	Metodo con el while y el switch del login
	
	public static void loginSwitch() {
		
		while (!login) {
			switch (welcomeOption) {
			
				case 1: {
					
					iniciarSesion();
					
					break;
					
				}
			
				case 2: {
					
					registrarse();
					
					break;
					
				}
				
				default: {
					System.out.println("Dato no valido, Introduzca uno nuevo");
					System.out.println();
					welcomeMenu();
				}
				
			}
			
			
		}
		
	}
	
//	Metodo del default del airOption
	
	public static void opcionNoValida() {
		
		System.out.println("Opcion no valida porfavor introduzca otra opcion");
		airOption=teclado.nextInt();
		
	}
	
//	Metodo del case 0: cierras sesion
	
	public static void cerrarSesion() {
		
		login=false;
		System.out.println("Sesion cerrada correctamente");
		
	}
	
//=========================================	
//					VUELOS				  =
//=========================================	
	
//	Metodo del case 1: agregas vuelos
	
	public static void agregarVuelos() {
		
		System.out.println();
		System.out.println("----------Agregar Vuelos----------");
		System.out.println();
		System.out.print("Cuantos vuelos deseas agregar: ");
		int agreeFlights = teclado.nextInt();
		
		for (int x = flightsCounted ; x<agreeFlights ; x++) {	
			
			System.out.println("Cual va a ser tu " +(x+1) +" vuelo");
			flights [x] = teclado.next();
			flightsPrices[x] = generador.nextInt(50,300);
			flightsCounted++;
			
		}
		
		airMenu();
		
	}
	
//	Metodo del case 2: eliminas vuelos
	
	public static void eliminarVuelos() {
		
		System.out.println("\n----------Cancelar Vuelos----------");
		System.out.println();
		System.out.println("Cuantos vuelos desea cancelar");
		int cancelFlightsCount=teclado.nextInt();
		
		for (int i = 0; i<cancelFlightsCount;i++) {
			
			System.out.print("Que vuelo desea cancelar: ");
			String cancelFlights = teclado.next();
			
			for (int x = 0; x<flightsCounted; x++) {
				if (flights[x].equals(cancelFlights)) {
				
					flights[x]="Vuelo cancelado";
					flightsPrices[x]=0;
					
				}
			}
			
		}
		
		airMenu();
		
	}
	
//	Metodo del case 3: miras los vuelos echos hasta ahora
	
	public static void verVuelos() {
		
		System.out.println();
		System.out.println("----------Vuelos----------");
		System.out.println();
		for (int i = 0; i<flightsCounted;i++) {
			
			System.out.println("El vuelo hacia "  +flights[i] +", cuesta "  +flightsPrices[i] +"$");
			
		}
		
		System.out.println();
		airMenu();
		
	}
	
//	Metodo con el while y el switch del airOption
	
	public static void airSwitch() {
		
		while (airOption!=5 && airOption!=0) {
			switch (airOption) {
				default: {	
					opcionNoValida();	
					break;	
				}
//				En este caso cierras sesion
				case 0: {			
					cerrarSesion();		
					break;		
				}	
//				En este caso agregas velos
				case 1: {		
					agregarVuelos();		
					break;		
				}
//				En este caso eliminas vuelos
				case 2: {	
					eliminarVuelos();	
					break;	
				}
//				En este caso miras los vuelos echos hasta ahora
				case 3: {	
					verVuelos();
					break;
				}
			}
		}		
	}

	public static void main(String[] args) {
//		Este while nos hara que podamos cambier entre menus facilmente 
		while (!exit) {
//			Al principio siemrpe ponesmos el login en false para que si cerramos sesion vuelva a pasar por el login en vez de pasar de el	
			login=false;
			welcomeMenu();
			loginSwitch();
			airMenu();
			airSwitch();
		}
	}
}