package boletin04;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// leer 5 numeros y mostrarlos en el mismo orden introducido
		
		int a[]=new int[5];
		Scanner leer = new Scanner(System.in);
		
		for (int j = 0; j < 5; j++) {
			System.out.println((j+1)+"Ingrese el valor: ");
			a[j] =leer.nextInt();
		}
		
		
		for (int j = 0; j < 5; j++) {
			System.out.println((j+1)+") "+a[j]);
			
		}
		
		
		
 
	}

}
