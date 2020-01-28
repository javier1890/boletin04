package boletin04;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		// crear un programa que lea por teclado una tabla de 10 nyumeros y la desplace
		// una posicion hacia abajo
		// (el ultimo pasa a ser el primero)
		Scanner leer = new Scanner(System.in);
        int[] tabla=new int[10];
        
		System.out.println("Tabla A:");
		for (int i = 0; i <= 9; i++) {
			System.out.println((i + 1) + ")ingresar el valor:");
			tabla[i] = leer.nextInt();
	
		}
		
		System.out.println("Mostrando Tabla A:");
		for (int i = 0; i <= 9; i++) {
			System.out.println(tabla[i]);
		}
		
		
		int aux,aux2;
		
		System.out.println("Mostrando Tabla A:");
		for (int i = 0; i <= 9; i++) {
			
			if ((tabla.length-1)==9) {
				aux=tabla[tabla.length-1];
				aux2=tabla[0];
				
				
				tabla[0]=aux;
				tabla[1]=aux2;
			}else {
				aux=tabla[i];
		    	tabla[i+1]=aux;
				
//				aux = tabla[i + 1];
//                tabla[i + 1] = tabla[i];
//                tabla[i] = aux;
			}
			System.out.println(tabla[i]);
		}
		
	}

}
