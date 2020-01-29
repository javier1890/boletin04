package boletin04;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		//  Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar la posición
		//en que se encuentra. Si no está, indicarlo con un mensaje.
		int[] tabla1=new int[10];
		Scanner leer= new Scanner(System.in);
		int n,j;
		
		System.out.println("Tabla A:");
		for (int i = 0; i < 10; i++) {
			tabla1[i]=(int)(Math.random()*20);
			System.out.print(tabla1[i]+" ");
		}
		
		System.out.println("\nEl numero a buscar:");
		n=leer.nextInt();
		
		
		for (int i = 0; i < tabla1.length; i++) {
			if (tabla1[i]==n) {
				j=i;
				System.out.println("\nEl numero buscado es:"+tabla1[j]);
				System.out.println("\nSu posicion es: "+j);
				break;
			}else {
				System.out.println("\nEl numero buscado no existe!!:");
				break;
			}
		}

	}

}
