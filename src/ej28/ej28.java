package ej28;
import java.util.Scanner;

public class ej28 {

	public static void main(String args[]) throws InterruptedException  {
		
		Scanner datos = new Scanner(System.in);
		
		int bateria = 100;
		
		System.out.println("Tienes 100% de bateria");
		
		do {
			if (bateria <= 100 && bateria > 15) {
			System.out.println("su bateria esta bajando:" + bateria + " % \n" );
			Thread.sleep(20);
			
			}
			if (bateria == 20) {
				System.err.println("su bateria esta baja: " + bateria + "% \n");
				Thread.sleep(1000);	
			}
			if (bateria <= 15 && bateria >= 1) {
				System.err.println("su bateria esta muy baja: " + bateria + "% \n");
				Thread.sleep(200);
				
			}
			bateria --;
			
		}while(bateria > 0);
		
		if (bateria == 0 ) {
			System.err.println("tan vicio vas a hacer se acabo la bateria: " + bateria + "%");
		}
			
			
		
	}
}