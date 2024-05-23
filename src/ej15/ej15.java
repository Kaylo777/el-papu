package ej15;
import java.util.Scanner;

public class ej15 {
	public static void main(String[] argts ) {
		Scanner datos = new Scanner (System.in) ;
		
		float costo;
		
		System.out.println("mira tanque de capeletinis, hoy gastaste esto pa comer \n");
		costo = datos.nextInt();
	
		
		if (costo >= 15000) {
			
			costo = costo*0.9f;
		
		
		System.out.println("este es su descueto " + costo);
			
		}
		else {
			System.out.println("en su costo no es necesario un descuento");
		}
	}
		
}
