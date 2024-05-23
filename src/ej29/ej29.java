package ej29;

import java.util.Scanner;

public class ej29 {

	public static void main(String args[]) throws InterruptedException  {
	
		Scanner datos = new Scanner(System.in);
		
		int i;
		
		System.out.println("Tienes 100% de bateria");
		
		for (i = 100; i >= 20; i--) {
			System.out.println("la cantidad de bateria es " + i + "%");
			Thread.sleep(50);
			if (i == 20) {
				System.err.println("su bateria esta baja chancho " + i + "%");
				Thread.sleep(1000);
			}
		}
		for (i = 19; i >= 0; i--) {
			
			if (i <= 19 && i >= 16) {
			System.out.println("la cantidad de bateria es " + i + "%");
			Thread.sleep(50);
			}
			if (i <= 15 && i >= 1) {
				System.err.println("su bateria esta muy baja: " + i + "% \n");
				Thread.sleep(200);
				
			}
			if (i == 0 ) {
				System.out.println("se te acabo la bateria por vicio" + i + "%");
			}
		}
		
	}
}