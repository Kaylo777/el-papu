package ej53;

import java.util.ArrayList;
import java.util.Scanner;

public class ej53 {
	
	static Scanner datos = new Scanner (System.in);
	static ArrayList<Integer> nota = new ArrayList<>();
	
	
	public static void IngresoDeNotas() {
		int cantidad = 5;
		for (int i = 0; i < cantidad; i++) {
			System.out.println("ingrese las notas");
			nota.add(datos.nextInt());
			
		}	
	}
		
	
	public static void SumaDeNotas() {
		int suma = 0;
		int divi;
		for (int i = 0; i < nota.size(); i++) {
			suma += nota.get(i);
			
		}
		divi = suma/5 ;
		
		System.out.println("este fue el promedio de las nota:\n" + divi);
		
		for (int i = 0; i < nota.size() - 1; i++) {
		    for (int j = 0; j < nota.size() - i - 1; j++) {
		        if (nota.get(j) > nota.get(j + 1)) {
		            // Intercambiar elementos
		            int temp = nota.get(j);
		            nota.set(j, nota.get(j + 1));
		            nota.set(j + 1, temp);
		        }
		    }
		}
		System.out.println("estas son las notas ordenadas \n" + nota);
		
	}
	public static void main(String[] args) {
		IngresoDeNotas(); 
		SumaDeNotas();
	}

}
