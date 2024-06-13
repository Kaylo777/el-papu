package ej45new;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ej45new {

	public static void main(String[] args) {
		ArrayList<String> pais = new ArrayList<>();		
		  Scanner scanner = new Scanner(System.in);
		  	
		  pais.add("Argentina");
		  pais.add("Uruguay");
		  pais.add("Brasil");
		  pais.add("Bolivia");
		  pais.add("Paraguay");
		  pais.add("Chile");
		  pais.add("venezuela");
		  pais.add("Ecuador");
		  pais.add("Colombia");
		  pais.add("Peru");
		  pais.add("Guayana francesa");
		  pais.add("Surinam");
		  pais.add("Guayana");

			boolean encontrado = false;
		  
			System.out.println("Ingrese un pais a buscar");
			String paisBuscado = scanner.next();
			
			
		  for (int i = 0; i < pais.size(); i++) {
			  
			  
			  if (pais.get(i).equalsIgnoreCase(paisBuscado)) { 
					System.out.println("El pais es Sudamericano \n");
					encontrado = true;
			  }
			  if(pais.get(i).equalsIgnoreCase(paisBuscado)) {
				  System.out.println("Ingrese otro pais");
				  String pa = scanner.next();
			  }
			  if (encontrado == false) {
				  System.out.println("No se encontro el pais :u \n");
				  System.out.println("ingrese otro pais");
				  String pa = scanner.next();
			  }
		  }


	}

}
