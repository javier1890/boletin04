package boletin04;

import java.util.Arrays;

public class Ejercicio14 {

	public static void main(String[] args) {
		//14. Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos
		//tablas en una tercera, de forma que sigan ordenados.

        int[] tabla1=new int[10];
        int[] tabla2=new int[10];
        int[] tabla3=new int[tabla1.length+tabla2.length];
        int j=0,aux=0;
        
		System.out.println("Tabla A:");
		for (int i = 0; i < 10; i++) {
			tabla1[i]=(int)(Math.random()*20);
			tabla2[i]=(int)(Math.random()*20);
			System.out.print(tabla1[i]+" ");
		}
		
		System.out.print("\n\nTabla B:\n ");
		for (int i = 0; i < 10; i++) {
			System.out.print(tabla2[i]+" ");
		}
		System.out.print("\n\n******ARRAYS ODENADOS******:\n ");
		Arrays.sort(tabla1);
		Arrays.sort(tabla2);
		
		System.out.println("\n\nTabla A:\n");
		System.out.print(Arrays.toString(tabla1));
		
		System.out.println("\n\nTabla B:\n");
		System.out.print(Arrays.toString(tabla2));
		
		
		
		
		for (int i = 0; i < tabla2.length; i++) {
			tabla3[j]=tabla1[i];
			j++;
			tabla3[j]=tabla2[i];
			j++;		
		}
		System.out.print("\n\n******Tabla C FUSIONADO******:\n ");
		for (int i = 0; i < tabla3.length; i++) {
			System.out.print(tabla3[i]+" ");
		}
		
		System.out.print("\n\n******Tabla C ODENADA******:\n ");
		for (int i = 0; i < tabla3.length; i++) {
			for (int k = 0; k < tabla3.length-i-1; k++) {
				if(tabla3[k+1]<tabla3[k]) {
					aux=tabla3[k+1];
					tabla3[k+1]=tabla3[k];
					tabla3[k]=aux;
				}
			}
		}
		
		for (int i = 0; i < tabla3.length; i++) {
			System.out.print(tabla3[i]+" ");
		}
	}

}
