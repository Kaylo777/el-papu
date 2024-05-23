package ej20;
import java.util.Scanner;

public class ej20 {
	public static void main(String args[]) throws InterruptedException {
	Scanner datos = new Scanner (System.in) ;
	
	int seguidor = 1;
	
	while (seguidor <= 100) {
		System.out.println("nuevo segudor: "+seguidor);
		Thread.sleep(100);
		
		if (seguidor == 100) {
			System.out.println("fua tio tu ya tienes 100 sub flipo tu  " + seguidor );
		}

		seguidor ++;
	}
	

	
   }
}
	
	