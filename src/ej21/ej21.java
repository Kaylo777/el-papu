package ej21;
import java.util.Scanner;

public class ej21 {
	public static void main(String args[]) throws InterruptedException {
	Scanner datos = new Scanner (System.in) ;
	
	int temp = 2;
	
	while (temp <= 100) {
		
		System.out.println("sube la tempratura: "+ temp);
		Thread.sleep(100);
		
		if (temp == 35) {
			System.out.println("y yo creo es aceptable esta temperatura chacalin" + temp  );
		}
        if (temp == 80) {
        	System.out.println("metele hielo a esto porque explota, AAAAHHHH" + temp);
        }
        if (temp == 100) {
        	System.out.println("tarde taradito, ya te exploto todo papi, y eso que te dije, vos te pensas que los componentes son baratos? " + temp);
        }
        
		temp ++;
	}
	
	
	
	
	}
}
	