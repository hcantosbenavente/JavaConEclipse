package Ejercicio_Tipo_Examen;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("¿Cuantas temperaturas vas a introducir? ");
		int cantidadTemperaturas = teclado.nextInt();
		int temperatura,maxima=Integer.MAX_VALUE,minima=Integer.MIN_VALUE,media=0,posicionMax=0,posicionMin = 0;
		int mayoresTreinta=0,menoresCero=0,ceroTreinta=0;
		
			if (cantidadTemperaturas>0) {
				for (int i =0;i<cantidadTemperaturas;i++) {
				
					System.out.print("t" +(i+1) +": ");
					temperatura=teclado.nextInt();
					System.out.println();
					
					media=media+temperatura;
					
					if (maxima>temperatura) {
						maxima=temperatura;
						posicionMax=(i+1);
					} else if (minima<temperatura) {
						minima=temperatura;
						posicionMin=(i+1);
					}
					
					if (temperatura<0) {
						menoresCero++;
					} else if (temperatura>=0 && temperatura<=30) {
						ceroTreinta++;
					} else if (temperatura>30){
						mayoresTreinta++;
					}
					
					
				}
				float sumaTemp = (float) media/cantidadTemperaturas;
				
				System.out.println(">30: " +mayoresTreinta +", <0: " +menoresCero +", entre 0 y 30: " +ceroTreinta);
				System.out.println();
				System.out.println("La temperatura mas alta es: " +maxima +" y esta en la posicion: " +posicionMax);
				System.out.println("La temperatura mas baja es: " +minima +" y esta en la posicion: " +posicionMin);
				System.out.println("La suma total es: " +media);
				System.out.println("La media es: " +(sumaTemp));
				
			} else {
				System.out.println("El programa a acabado");
			}
	teclado.close();
	}

}
