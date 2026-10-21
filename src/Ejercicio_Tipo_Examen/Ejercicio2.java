package Ejercicio_Tipo_Examen;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float productPrice, cartera=50, carrito=0, devolver;
		int agreeCount=0, devolutionCount=0;
		
		System.out.println("Indique la operacion que desea realizar");
		System.out.println();
		System.out.println("1) Añadir");
		System.out.println("2) Quitar");
		System.out.println("3) Comprar");
		System.out.println("4) Ver");
		System.out.println("5) Salir");
		int userOption = teclado.nextInt();
		
		while (userOption!=5) {
			switch (userOption) {
		
				case 1: {
					
					System.out.println("Indique el precio del producto");
					productPrice=teclado.nextFloat();
					
					while (productPrice<0) {
						System.out.println("EL precio no es valido introduzca otro precio");
						productPrice=teclado.nextFloat();
					}
					
					System.out.println("Producto añadido");
					carrito=productPrice+carrito;
					System.out.println("Saldo actua: " +(cartera-carrito));
					System.out.println();
					
					agreeCount++;
					
					System.out.println("Indique la operacion que desea realizar");
					System.out.println();
					System.out.println("1) Añadir");
					System.out.println("2) Quitar");
					System.out.println("3) Comprar");
					System.out.println("4) Ver");
					System.out.println("5) Salir");
					userOption = teclado.nextInt();
					
					break;
			
				}
				
				case 2: {
					
					System.out.println("Indique el precio del producto a devolver");
					devolver=teclado.nextFloat();
					
					while (devolver<0) {
						System.out.println("EL precio no es valido introduzca otro precio");
						devolver=teclado.nextFloat();
					}
					
					System.out.println("Producto quitado");
					carrito=carrito-devolver;
					System.out.println("Saldo actual:" +(cartera-carrito));
					System.out.println();
					
					devolutionCount++;
					
					System.out.println("Indique la operacion que desea realizar");
					System.out.println();
					System.out.println("1) Añadir");
					System.out.println("2) Quitar");
					System.out.println("3) Comprar");
					System.out.println("4) Ver");
					System.out.println("5) Salir");
					userOption = teclado.nextInt();	
					
					break;
					
				}
				
				case 3:{
					
					if ((cartera-carrito)<0) {
						System.out.println("Saldo insuficinete, devuelva un producto si desea realizar la compra");
						userOption=2;
					}else {
						cartera=cartera-carrito;
						System.out.println("Compra realizada saldo restante: " +cartera);
						System.out.println();
						System.out.println("Indique la operacion que desea realizar");
						System.out.println();
						System.out.println("1) Añadir");
						System.out.println("2) Quitar");
						System.out.println("3) Comprar");
						System.out.println("4) Ver");
						System.out.println("5) Salir");
						userOption = teclado.nextInt();
					}	
					
					break;
					
				}
				
				case 4:{
					System.out.println("Productos añadidos: " +agreeCount);
					System.out.println("Productos devueltos: " +devolutionCount);
					System.out.println("Saldo restante:" +(cartera-carrito));
					System.out.println();
					System.out.println("Indique la operacion que desea realizar");
					System.out.println();
					System.out.println("1) Añadir");
					System.out.println("2) Quitar");
					System.out.println("3) Comprar");
					System.out.println("4) Ver");
					System.out.println("5) Salir");
					userOption = teclado.nextInt();
					
				}
				
				case 5: {
					System.out.println("Gracias por comprar en nuestra tienda espero que pase un buen dia");
				}
				
				default:{
					System.out.println("Opcion no valida introduzca un opcion valida");
					System.out.println();
					System.out.println("Indique la operacion que desea realizar");
					System.out.println();
					System.out.println("1) Añadir");
					System.out.println("2) Quitar");
					System.out.println("3) Comprar");
					System.out.println("4) Ver");
					System.out.println("5) Salir");
					userOption = teclado.nextInt();

					
					break;
				}
		
			}
		
		}
	teclado.close();
	} 

}
