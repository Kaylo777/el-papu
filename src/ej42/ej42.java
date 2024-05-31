package ej42;

import java.util.Scanner;

public class ej42 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in) ;
		
		int[] ran = new int[3];
		
		double nume = (Math.random()*50); 
		 int papu = (int)nume;
		
		 for (int i = 0; i < ran.length; i++) {
			 System.out.println("a ver ingrese un numero: ");
				ran[i] = datos.nextInt();
		}
		 
//		System.out.println("a ver ingrese su primer numero");
//		ran[0] = datos.nextInt();
//		System.out.println("para tener mas chanses ingrese otro");
//		ran[1] = datos.nextInt();
//		System.out.println("Y como andamos golazos le dejamos otra oportunidad");
//		ran[2] = datos.nextInt();
		
		for (int i = 0; i < ran.length; i++) {
			
			if(ran[i] == papu) {
				System.out.println("FUAAAAAA DE PALO LE PEGASTE");
			}else if(ran[i] != papu) {
				System.err.println("NOOOOOO PARA QUE TE TRAJE");
			}
		}
		
		
		
	}

}
