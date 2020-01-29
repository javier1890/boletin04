package boletin04;


public class Ejercicio13 {

	public static void main(String[] args) {
		//  Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los
		//  elementos impares.
		//  Realizar dos versiones: una trabajando con los valores y otra trabajando con los índices.
        int conta1=0,conta2=0;
        int[] tabla=new int[10];
        
		System.out.println("Tabla A:");
		for (int i = 0; i < 10; i++) {
			tabla[i]=(int)(Math.random()*20);
            
			if ((tabla[i]%2)==0) {
				conta1++;
			}else {
				conta2++;
			}
			System.out.print(tabla[i]+" ");
		}
	System.out.print("\nLos pares son:"+conta1);
		System.out.print("\nLos impares son:"+conta2);
		
		int[] par=new int[conta1];
		int[] impar=new int[conta2];
		int x=0,y=0;
		
		for (int i = 0; i < 10; i++) {
            
			if ((tabla[i]%2)==0) {
				par[x]=tabla[i];
				x++;
			}else {
				impar[y]=tabla[i];
				y++;
			}
		}
		
		System.out.print("\n\n********************************* ");		
//		imprimir el array de LoopExplosionKind pares
		System.out.print("\n\nArreglo de pares: ");
		for (int i = 0; i < conta1; i++) {
			System.out.print(par[i]+"  ");
		}
		
//		imprimir el array de LoopExplosionKind impares
		System.out.print("\n\nArreglo de impares: ");
		for (int i = 0; i < conta2; i++) {
			System.out.print(impar[i]+"  ");
		}
		

	}

}
