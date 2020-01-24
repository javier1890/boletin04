package boletin04;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// leer 5 numeros y mostrarlos en el orden inverso introducido

		
		int a[]=new int[5];
		Scanner leer = new Scanner(System.in);
		
		for (int j = 0; j < 5; j++) {
			System.out.println((j+1)+"Ingrese el valor: ");
			a[j] =leer.nextInt();
		}

		for (int j = 4; j >=0; j--) {
			System.out.println((j)+") "+a[j]);
			
		}
	}

}
