package ej11;

import java.util.Scanner;

 public class ej11 {
	
	public static void main(String[] argts ) {
		
		Scanner datos = new Scanner (System.in) ;
		
		int rayman;
		 
		System.out.println("cual es tu numerin? ");
		 rayman = datos.nextInt();
		 
		 
		 if(rayman == 0) {
			 System.out.println("tu numero es igual a 0, porque tu no eres competitivo tu quien coño eres, pedazo de gillipollas come marmotas anda a afeitarte ");
		 }else if (rayman >= 1) {
			 System.out.println("tu numero es positivo a el tamaño de tito XD ");
		 }else if (rayman < 0 ) {
			 System.out.println("tu numero es negativo como la birra de sol ");

		 }
	}
	
}