package ej44new;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ej44new {

	public static void main(String[] args) {
		ArrayList<String> equipo = new ArrayList<>();
		
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("a ver los equipos que te sabes :u (escriba 'fin' para terminar TwT):");
	        String entrada = scanner.nextLine();
	        
	        while (!entrada.equalsIgnoreCase("fin")) {
	            equipo.add(entrada);
	            entrada = scanner.nextLine();
	        }
	        HashSet<String> set = new HashSet<>(equipo);

	        equipo.clear();

	        equipo.addAll(set);

		
			Collections.sort(equipo);
			
			  int tamano = equipo.size();
		        System.out.println("pusiste estos equios: "+tamano); 
		        
		        System.out.println("los equipos son: " + equipo);
			
	}

}
