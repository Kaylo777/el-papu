package ej10;

import java.util.Scanner;

 public class ej10 {
	
   public static void main(String[] argts) {
		
	Scanner datos = new Scanner (System.in) ;
	
	
	int choricremoso;
	
	 double nume = (Math.random()*99); 
	 int papu = (int)nume;
	 
	 System.out.println("cual es tu numerin? ");
	 choricremoso = datos.nextInt();
	 
	 if (choricremoso == nume) {
		 System.out.println("BINGOOOOOOOOOOO \n");
	 }
	 else {
		 System.out.println("NOOOOOOOOOOOOO CASI TwT \n");
		 System.out.println("El numero ganador era: " + papu);
	 }
	 
	
	
	
	
	}
  
	
}

	
       		
		
	
		
		