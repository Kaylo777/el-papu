package ej50new;

import java.util.Scanner;

public class ej50new {
	static Scanner entrada = new Scanner(System.in); 
	static String nombre;
 private static void name() {

 }
	 public static void ingresarNombre() {
			System.out.println("\nIngresa tu nombre: ");
			 nombre = entrada.nextLine();
			
}
	 public static void mostrarNombre() {
		 System.out.println("\nel Nombre es: " + nombre);
	 }
	 public static void main(String[] args) {
		 ingresarNombre();
		 mostrarNombre();
		 ingresarNombre();
		 mostrarNombre();
		 ingresarNombre();
		 mostrarNombre();
	 }
}
