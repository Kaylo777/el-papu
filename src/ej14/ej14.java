package ej14;
import java.util.Scanner;

public class ej14 {
	
	public static void main(String[] argts ) {
		Scanner datos = new Scanner (System.in) ;
		
		
		int i;
		
		System.out.println("ingrese un numero para ver si se puede dividir \n");
		i = datos.nextInt();
		
		if (i < 1) {
			System.out.println("su numero no se puede divi muchacho ");
		}else if (i > 1) {
			System.out.println("con su chiqui numero si se puede");
		}
		
		
		
	}
		
}