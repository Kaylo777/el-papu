package ej6;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner datos = new Scanner (System.in) ;
		 
		 String nombre;
		 String apellido;
		 
		 double nume = (Math.random()*99);
		 int papu = (int)nume;

		 
		 System.out.println("Cual es su nombre? ");
		 nombre = datos.next();
		 
		 System.out.println("Cual es su apellido? ");
		 apellido = datos.next();
		 
		
		 System.out.println("su nombre es: " + nombre);
		 System.out.println("su apellido es: " + apellido);
         System.out.println("su numero de bingo es: " + nume);
		 
		 
	}

}
