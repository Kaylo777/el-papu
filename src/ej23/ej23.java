package ej23;

import java.util.Scanner;

public class ej23 {
	public static void main(String args[]) throws InterruptedException {
	Scanner datos = new Scanner (System.in) ;
	
	int bingo;
	int fallos = 0;
	
	
	 double nume = (Math.random()*99); 
	 int papu = (int)nume;
	 System.out.println(papu);
	do {
		
		 System.out.println("cual es tu numerin? ");
			bingo = datos.nextInt();
			 
		
		if (bingo != papu) {
			System.out.println("incorrecto, vuelva a intentarlo");
			bingo = datos.nextInt();
			 
			}	
			if (fallos <= 2) {
			System.out.println("se acabo" );
			fallos++; 
		}	
			
			if (papu == bingo) {
				System.out.println("BINGOOOOOOOOOOOOOOO:");
				break;
				
			}
		}
		
		while ( bingo == papu ); 
		if(bingo==papu) {
		
		System.out.println(" " + papu);
			
		}
		
		
		
		}

	
	
  }
