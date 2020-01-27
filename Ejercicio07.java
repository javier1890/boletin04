package boletin04;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// leer por teclado una serie de 10 numero enteros 
        //La aplicacion de indicarnos si los numeros estan ordenados de forma creciente ,decrciente ,decreciente ,o si estan desordenados
		
		int[] tabla3 = new int[10];
		int conta1=0,conta2=0;

		Scanner leer = new Scanner(System.in);

		System.out.println("Matriz A:");
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ")ingresar el valor:");
			tabla3[i] = leer.nextInt();
		}
		
		
		
		
		
		
		
		
		int aux=0,j=0,i=0;
		
		//metodo dela burbuja
		
		
		
		if (tabla3[j + 1] < tabla3[j]) {
			System.out.println("Mostrar el vector desordenado");
			for (i = 0; i < 10; i++) {
				System.out.println((i + 1) + ")"+tabla3[i]);
			}
		}else{
			
			System.out.println("Mostrar el vector ordenado");
			 for (i = 0; i < 10 - 1; i++) {
		            for (j = 0; j < 10 - i - 1; j++) {
		                if (tabla3[j + 1] < tabla3[j]) {
		                    aux = tabla3[j + 1];
		                    tabla3[j + 1] = tabla3[j];
		                    tabla3[j] = aux;
		                }
		            }
		        }
			 
			 for (i = 0; i < 10; i++) {
					System.out.println((i + 1) + ")"+tabla3[i]);
				}
			 
			 System.out.println("*******************************");
			 System.out.println("Mostrar el vector decreciente");
			
			 
			 for (int k = 9; k >= 0; k--) {
					System.out.println(k + ")"+tabla3[k]);
				}
		}
		
		

		 
		 

		
	}

}
