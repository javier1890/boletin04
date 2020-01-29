package boletin04;

import java.util.Scanner;

public class Ejercicio16 {
	

	public static void main(String[] args) {
		System.out.println("***********************************\n");
		//  Queremos desarrollar una aplicación que nos ayude a gestio ar las notas de un centro educativo. Cada
		//  grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer
		//  trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media
		//  del alumno que se encuentra en la posición N (N se lee por teclado).
		Scanner leer=new Scanner(System.in);
		
		
//		Thread.sleep(millis);
//		Character.isDigit();
		
		String[] alumno=new String[5];
		int[] primer=new int[5];
		int[] segundo=new int[5];
		int[] tercer=new int[5];
		
		
		System.out.println("|************DATOS DEL GRUPO DE ALUMNOS*************|\n");
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingresar nombre del alumno "+i+1+":");
			alumno[i]=leer.next();
			
			System.out.println("Ingresar nota del primer trimestre del alumno "+i+1+":");
			primer[i]=leer.nextInt();
			
			System.out.println("Ingresar nota del segundo trimestre del alumno"+i+1+":");
			segundo[i]=leer.nextInt();
			
			System.out.println("Ingresar nota del tercer trimestre del alumno"+i+1+":");
			tercer[i]=leer.nextInt();

			System.out.println("Ingresar nota del tercer trimestre del alumno"+i+1+":");
			
		}
		
		System.out.println("\n\n");
		
		
		for (int i = 0; i < tercer.length; i++) {
			
		}

	}

}



