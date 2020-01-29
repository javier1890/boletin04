package boletin04;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		//  Leer por teclado una tabla de 10 elementos numéricos enteros y leer una posición (entre 0 y 9).
		//Eliminar el elemento situado en la posición dada sin dejar huecos.
		
		Scanner leer = new Scanner(System.in);
        int[] tabla=new int[10];
        int pos;
        
		System.out.println("Tabla A:");
		for (int i = 0; i <= 9; i++) {
			System.out.println((i + 1) + ")ingresar el valor:");
			tabla[i] = leer.nextInt();
		}
		
		for (int i = 0; i <= 9; i++) {
			System.out.print(tabla[i]+" ");
		}
		System.out.print("\n***************************");
		System.out.println("\nIngrese la posicion del elemento a eliminar [0-9]:");
		pos = leer.nextInt();
		
		for (int i = 0; i <= 9; i++) {
			if (pos==i) {
				tabla[pos]=0;
			}
			System.out.print(tabla[i]+" ");
		}
	}

}
