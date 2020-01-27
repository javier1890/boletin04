package boletin04;

import java.util.Scanner;

public class Ejercicio06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// leer los datos correspondientes a dos tablas de 12 elementos numericos y
		// mezcladosen una tercera de la forma :3 de la tabla A,
		// 3 de la B, otros 3 de la B , otros 3 de A, otros de la B ,etc.

		int[] tabla1 = new int[12];
		int[] tabla2 = new int[12];
		int[] tabla3 = new int[tabla1.length + tabla2.length];
		int conta1=0,conta2=0;

		Scanner leer = new Scanner(System.in);

		System.out.println("Matriz A:");
		for (int i = 0; i < 12; i++) {
			System.out.println((i + 1) + ")ingresar el valor:");
			tabla1[i] = leer.nextInt();
		}

		System.out.println("Matriz B:");
		for (int i = 0; i < 12; i++) {
			System.out.println((i + 1) + ")ingresar el valor:");
			tabla1[i] = leer.nextInt();
		}

		System.out.println("******************************");
		System.out.println("Matriz A:");
		for (int i = 0; i < 12; i++) {
			System.out.println((i + 1) + ")" + tabla1[i]);

		}

		System.out.println("Matriz B:");
		for (int i = 0; i < 12; i++) {
			System.out.println((i + 1) + ")" + tabla2[i]);

		}

		System.out.println("******************************");
		for (int i = 0; i < tabla3.length; i++) {

		}

		// forma 2
		
		for (int i = 0; i < tabla3.length; i++) {
			if (i == 0) {
				tabla3[i] = tabla1[0];
			} else if (i == 1) {
				tabla3[i] = tabla2[0];
			} else if (i % 2 != 0) {
				tabla3[i] = tabla1[conta1];
				conta1++;
			} else {
				tabla3[i] = tabla2[conta2];
				conta2++;
			}
		}
		
		
		System.out.println("fusion de A y B:");
		for (int i = 0; i < tabla3.length; i++) {
			System.out.println(tabla3[i]);

		}
		

	}

}
