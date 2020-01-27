package boletin04;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//diseñar una aplicacion que declare una tabla de 10 elementos enteros .
		//Leer mediante el teclado 8 numeros .despues se debe pedir un numero y una posicion , insertando en la posicion indicada,
		//desplazando los que esten detras
		
		//incompleto
		
		int[] tabla3 = new int[10];
		int j=0,k=0,aux=0;

		Scanner leer = new Scanner(System.in);

		System.out.println("Tabla A:");
		for (int i = 0; i < 8; i++) {
			System.out.println((i + 1) + ")ingresar el valor:");
			tabla3[i] = leer.nextInt();
	
		}
	
		System.out.println("*******************************************");
			System.out.println(")ingresar el valor:");
			k = leer.nextInt();
			
			System.out.println(")ingresar la posicion [0-9]:");
			j = leer.nextInt();		
			System.out.println("*******************************************");
		
		for (int i = 0; i < tabla3.length-1; i++) {
			if (j==i) {
				tabla3[j]=k;
				System.out.println((i + 1) + ")"+tabla3[j]);
				 
			}else if (i<j) {
				System.out.println((i + 1) + ")"+tabla3[i]);
			}else {
				aux = tabla3[i + 1];
                tabla3[i + 1] = tabla3[i];
                tabla3[i] = aux;
                System.out.println((i + 1) + ")"+tabla3[i]);
			}
			
			
		}
		
		
		

	}

}
