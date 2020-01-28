package boletin04;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Desplazar N posiciones (N debe ser ingresado por el usuario)

		Scanner leer = new Scanner(System.in);
        int[] tabla=new int[10];
        int limite;
        
        System.out.println("ingresar el valor limite:");
		limite = leer.nextInt();
        
		System.out.println("Tabla A:");
		for (int i = 0; i <=limite; i++) {
			System.out.println((i + 1) + ")ingresar el valor:");
			tabla[i] = leer.nextInt();
	
		}
	}

}
