package ej39;

import java.util.Scanner;

public class ej39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner (System.in) ;
		
		String[] nombre = new String[10];
		int[] edad = new int [10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Ingrese el nombre del jugador: ");
			nombre[i] = datos.next();
			
			System.out.println("Ingresa la edad de los jugadores;");
			edad[i] = datos.nextInt();
		}
		
		for (int i = 0; i < edad.length; i++) {
			System.out.println("el nombre del jugador es: " + nombre[i] + "\n");
			System.out.println("la edad del jugador es: " + edad[i] + "\n");
		}
		
		
	}

}
