package ej22;

import java.util.Scanner;

public class ej22 {
	public static void main(String args[]) throws InterruptedException {
	Scanner datos = new Scanner (System.in) ;
	
	int bingo;
	
	 double nume = (Math.random()*99); 
	 int papu = (int)nume;
	 
	 
	 System.out.println("cual es tu numerin? ");
	bingo = datos.nextInt();
	 
	do { 
		if (bingo != nume) {
			System.out.println("incorrecto, vuelva a intentarlo");
			nume = datos.nextInt();
		}
		
	}
	while ( bingo == nume); {
		System.out.println("BINGOOOOOOOOOOOOOOO");
	
	 }
	 
	
	
	
	}
}