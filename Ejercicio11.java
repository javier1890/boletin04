package boletin04;

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio11 {

//		public static void buscar(int ) {
//		
//	}

//	private static String[] push(String[] array, String push) {
//	    String[] longer = new String[array.length + 1];
//	    for (int i = 0; i < array.length; i++)
//	        longer[i] = array[i];
//	    longer[array.length] = push;
//	    return longer;
//	}

	@SuppressWarnings("unused")
	public static int[] insertar(int tabla[], int num) {

		int[] arreglo = new int[tabla.length + 1];
		for (int i = 0; i < arreglo.length-1; i++) {
			arreglo[i] = tabla[i];
		}
		arreglo[tabla.length] = num;

		return arreglo;

	}
	


	public static void main(String[] args) {
		// leer 5 elementos numericos que se introduccen ordenados de fotma creciente .
		// Estos los guardaremos en una tabla de tama�o 10 .Leer un numero N, e
		// insertarlo en el lugar adecuado
		// para la tabla continue ordenado

		Scanner leer = new Scanner(System.in);
		int[] tabla = new int[10];
		int num;

		System.out.println("Tabla A:");
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ")ingresar el valor:");
			tabla[i] = leer.nextInt();

		}


//		System.out.println("ingresar el valor  (posicion):");
//		num = leer.nextInt();
//
//		tabla = insertar(tabla, num);
//		Arrays.sort(tabla);
//
//		System.out.print(Arrays.toString(tabla));
		
		
		int i=0,p=0;
		int cero=0;
		while (i<10) {
			if (tabla[i]==0) {
				cero++;
			}			
			i++;	
		}
		
		
		for (int j = cero; j >= 0; j--) {
			System.out.println("\ningresar el valor  (posicion):");
			num = leer.nextInt();

			tabla = insertar(tabla, num);
			Arrays.sort(tabla);

			System.out.print(Arrays.toString(tabla));
			
			
		}
		
		System.out.println("\n\nla cantidad de ceros es:"+cero);
		

//		for (int i = 0; i <10; i++) {
//			System.out.print(tabla[i]+"  ");
//			
//			
//		}
	}
}
