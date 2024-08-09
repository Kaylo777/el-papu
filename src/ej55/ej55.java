package ej55;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
public class ej55 {
	static Scanner datos = new Scanner(System.in);
	static ArrayList<Integer> dni = new ArrayList<>();
	
	public static void ingresoDeDNI() {
		System.out.println("Cuantos DNI va a ingresar?");
		int cantidad = datos.nextInt();
		System.err.println("-------------------\n");
		for (int i = 0; i < cantidad; i++) {
			System.out.println("ingrese su DNI: ");
			dni.add(datos.nextInt());
		}	
	}
	public static void AcomodacionDeDNI() {
		System.out.println("su lista de DNI quedo asi: \n" + dni);
		System.out.println("");
		// DNI.size() es para listas (cantidad de elementos)
		
		for (int i = 0; i < dni.size() - 1; i++) {
		    for (int j = 0; j < dni.size() - i - 1; j++) {
		        if (dni.get(j) > dni.get(j + 1)) {
		            // Intercambiar elementos
		            int temp = dni.get(j);
		            dni.set(j, dni.get(j + 1));
		            dni.set(j + 1, temp);
		        }
		    }
		}
	}
		public static void ordanamientoMenor() {
			System.out.println("su lista de DNI quedo asi despues de acomadamiento: \n" + dni);
			
			System.out.println("");
		
			for (int i = 0; i < dni.size() - 1; i++) {
	            for (int j = 0; j < dni.size() - i - 1; j++) {
	                if (dni.get(j) < dni.get(j + 1)) {
	                    int temp = dni.get(j);
	                    dni.set(j, dni.get(j + 1));
	                    dni.set(j + 1, temp);
	                }
	            }
	        }
			System.out.println("y asi quedo despues de otro acomadamiento :) \n" + dni);
			
		}
	
	public static void main(String[] args) {
		ingresoDeDNI();
		AcomodacionDeDNI();
		ordanamientoMenor();
	}

	}
