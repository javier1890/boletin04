package boletin04;

import java.util.Arrays;

public class Ejercicio041 {

	public static void main(String[] args) {
		// 4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo,
		// el penúltimo, el tercero, etc.
		
		
		int[] num=new int[10];
		int[] num2=new int[10];
		int x=0,y=9;
		
		for (int i = 0; i < num.length; i++) {
			num[i]=(int)(Math.random()*30);
		}
		
		System.out.println("\nArreglo:");
		System.out.println(Arrays.toString(num));
		
		
		
		System.out.println("\nArreglo mostrado en orden el primero-ultimo,segundo-penultimo:");
		for (int i = 0; i < num2.length; i++) {
			num2[i]=num[x];
			x++;
			if (x>4) {
				break;
			}
			i++;
			num2[i]=num[y];
			y--;
			if (y<5) {
				//num2[num2.length]=num[5];
				break;
			}
			
			
		}
		
		System.out.println(Arrays.toString(num2));


	}

}
