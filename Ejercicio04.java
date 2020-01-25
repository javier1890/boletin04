package boletin04;

import java.util.Scanner;

public class Ejercicio04{

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//leer 10 numeros por teclado y a continuacion realizar la media de los numeros positivos 
		//, la media de los negativos y contar el numero de ceros
		int[] valor=new int[10];
		Scanner leer=new Scanner(System.in);
		
		int i=0;
		int suma_pos=0,suma_neg=0;
		int conta1=0,conta2=0,conta3=0;
		float result1,result2;
		
		while (i<10) {
			System.out.println((i+1)+")ingresar el valor:");
			valor[i]=leer.nextInt();
			
			if (valor[i]>0) {
				suma_pos=suma_pos+valor[i];
				conta1++;				
			}else if (valor[i]==0) {
				conta3++;	
			}else {
				suma_neg=suma_neg+valor[i];
				conta2++;	
			}
			i++;
		}
		
		if (conta1>0) {
			result1=(float)(suma_pos/conta1);
		}else {
			result1=(float)(suma_pos/(conta1+1));
		}
		
		
		if (conta2>0) {
			result2=(float)(suma_neg/conta2);
		}else {
			result2=(float)(suma_neg/(conta2+1));
		}

		System.out.println("la media del los numeros positivos: "+result1);
		System.out.println("la media del los numeros negativos:"+result2);
		System.out.println("los cero ingresados son: "+conta3);
		}
	}


