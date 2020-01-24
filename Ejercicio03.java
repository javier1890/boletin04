package boletin04;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// leer 5 numeros por teclado y a continuacion realizar la media de los numeros positivos,
		//la media de los negativos y contarel numero de ceros

		int a;
		int suma1=0;
		int suma2=0;
		int suma3=0;
		int cont_post=0;
		int cont_neg=0;
		int cont_cero=0;
		int media1=0;
		int media2=0;
		int media3=0;
		Scanner leer = new Scanner(System.in);
		
		for (int j = 0; j < 5; j++) {
			System.out.println((j+1)+"Ingrese el valor: ");
			
			a =leer.nextInt();
			if (a>0) {
				suma1=suma1+a;
				cont_post++;				
			}else if (a==0) {
				suma2=suma2+a;
				cont_neg++;	
			}else {
				suma3=suma3+a;
				cont_cero++;	
			}
			
		}
		media1=suma1/cont_neg;
		media2=suma2/cont_neg;
		media3=suma3/cont_neg;
		
		System.out.println("la media del los numeros positivos: "+media1);
		System.out.println("la media del los numeros positivos:"+media2);
		System.out.println("la media del los numeros positivos: "+media3);
	}

}
