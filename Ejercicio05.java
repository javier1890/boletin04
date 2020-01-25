package boletin04;

import java.util.Scanner;

public class Ejercicio05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// leer por teclado dos tablas de 10 numeros enteros y
		// mezclarlas en una tercera de la forma : el 1° de A, el 1° de B. el 2° de A,el
		// 2° de B , etc

		char[] tabla1 = new char[5];
		char[] tabla2 = new char[5];
		char[] tabla3 = new char[tabla1.length+tabla2.length];
		Scanner leer = new Scanner(System.in);

		System.out.println("Matriz A:");
		for (int i = 0; i < tabla1.length; i++) {
			System.out.println((i + 1) + ")ingresar el valor:");
			tabla1[i] = leer.next().charAt(0);
		}

		System.out.println("Matriz B:");
		for (int i = 0; i < tabla2.length; i++) {
			System.out.println((i + 1) + ")ingresar el valor:");
			tabla2[i] = leer.next().charAt(0);
		}

		System.out.println("|***************************************|");
		System.out.println("|*******Matriz A:");
		for (int i = 0; i < tabla1.length; i++) {
			System.out.println(tabla1[i]);

		}

		System.out.println("|*******Matriz B:");
		for (int i = 0; i < tabla2.length; i++) {
			System.out.println(tabla2[i]);

		}

         int conta1=0,conta2=0;
		for (int i = 0; i < tabla3.length; i++) {

			//forma1
//			switch (i) {
//			case 0:
//				tabla3[i] = tabla1[0];
//				break;
//			case 1:
//				tabla3[i]=tabla2[0];
//				break;
//			case 2:
//				tabla3[i] = tabla1[1];
//				break;
//			case 3:
//				tabla3[i]=tabla2[1];
//				break;
//			case 4:
//				tabla3[i] = tabla1[2];
//				break;
//			case 5:
//				tabla3[i]=tabla2[2];
//				break;
//			case 6:
//				tabla3[i] = tabla1[3];
//				break;
//			case 7:
//				tabla3[i]=tabla2[3];
//				break;
//			case 8:
//				tabla3[i] = tabla1[4];
//				break;
//			case 9:
//				tabla3[i]=tabla2[4];
//				break;
//
//			}
		
			
			//forma 2
		if (i==0) {
			tabla3[i] = tabla1[0];
		}else if (i==1) {
			tabla3[i]=tabla2[0];
		}else if (i%2!=0) {
			tabla3[i]=tabla1[conta1];
			conta1++;
		}else {
			tabla3[i]=tabla2[conta2];
		    conta2++;
		}
			
		}

		System.out.println("fusion de A y B:");
		for (int i = 0; i < tabla3.length; i++) {
			System.out.println(tabla3[i]);

		}

	}

}
