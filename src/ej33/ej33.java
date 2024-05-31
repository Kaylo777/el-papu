package ej33;

import java.util.Scanner;

public class ej33 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in) ;
		
		int i;		
		String j;		
		String t;
		
		for (i = 1; i <= 11; i++) {
			
			if(i > 0 && i <= 11 ) {
				
				System.out.println("nombre del jugador ");
				 j = datos.next();
						
				System.out.println("edad del jugador ");
				 t = datos.next();
				 } 
			
			if(i == 11) {
				System.out.println("sebas sos un tramposo, Te quiero");
			}
		}
		
	}

}
