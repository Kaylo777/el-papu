package ej44;

import java.util.Scanner;

public class ej44 {

	public static void main(String[] args) {
		
//		Para encontrar números pares: variable_numerica%2=0 (¿la variable_numerica
//				al dividirse por 2 me da como resto 0?) . Esto nos permite buscar el “resto” de
//				una división. Cualquier número par dividido por 2, me dará como resto 0.
//				Cualquier número impar, da como resto 1.
//				En conclusión: “sí un número es par -> mostrarse en pantalla”.
		
		Scanner datos = new Scanner (System.in) ;
		
		int[] dni = new int[4];
		int div;
		
		 for (int i = 0; i < dni.length; i++) {
			 System.out.println("Ingrese un DNI : ");
			 dni[i] = datos.nextInt();
			 
			 if(dni[i] %2 == 0 ) {
				 System.err.println("No se admiten DNI pares. Ingresar de nuevo ");
				 i--;
				 continue;	
			 }
			 
		}
		 
		 for (int i : dni) {
			System.out.println("los DNI que quedaron son : " + dni[i]);
		}
		
	}

}
