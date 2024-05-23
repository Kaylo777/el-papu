
package ej13;
import java.util.Scanner;

public class ej13 {
	
	public static void main(String[] argts ) {
		
		Scanner entrada = new Scanner (System.in) ;
		 
            char talle;
		 
			System.out.println("Ingrese su talla guapisimo");
			talle = entrada.next().charAt(0);

			if(talle == 'S' || talle == 's') { 
				System.out.println("y mira, para vos quedan 5 remeras pedazo de chiquitin");
			}else if (talle == 'M' || talle == 'm') {		
				System.out.println("cuchame una pe quenadn como 3 remerihas papi.");
			}else if (talle == 'L' || talle == 'l') {
				System.out.println("andate pelotudo de mrd, no ves que no queda nada");
			}else {
				System.out.println("y ese talle papi?");
				

			}
			 
			
		 
		
		
	}
	
	
}
