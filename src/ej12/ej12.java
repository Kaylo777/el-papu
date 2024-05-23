package ej12;

import java.util.Scanner;

 public class ej12 {
	 
	 public static void main(String[] argts ) {
		 
		Scanner datos = new Scanner (System.in);
		
		int sacalabirra;
		
		System.out.println("muchacho cuanto saco");
		sacalabirra = datos.nextInt();
		
		if(sacalabirra > 10) {
			System.out.println("y ese numerin?, muchachin ");
		}else if(sacalabirra == 1 || sacalabirra == 2 || sacalabirra == 3) {
			System.out.println("nana alto fraca ");
		}else if(sacalabirra == 4 || sacalabirra == 5) {
			System.out.println("A ESTUDIAR !!!!");
		}else if(sacalabirra == 6 || sacalabirra == 7) {
			System.out.println("OPA aprobar es aprobar");
		}else if(sacalabirra == 8 || sacalabirra == 9) {
			System.out.println("vos sos de los buenos EH");
		}else {
			System.out.println("UFFFFFFF ALTO PAQUETE");
		}
			
		
		
	
		
		
	 }
			
			
 }
	
	
			