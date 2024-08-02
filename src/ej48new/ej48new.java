package ej48new;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
public class ej48new {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		 
		
		ArrayList<Integer> DNI = new ArrayList<>();
		
		System.out.println("Cuantos DNI va a ingresar?");
		int cantidad = Entrada.nextInt();
		
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("ingrese su DNI: ");
			DNI.add(Entrada.nextInt());
			
		}
		System.out.println("su lista de DNI quedo asi: \n" + DNI);
		
		// DNI.size() es para listas (cantidad de elementos)
		
		for (int i = 0; i < DNI.size() - 1; i++) {
		    for (int j = 0; j < DNI.size() - i - 1; j++) {
		        if (DNI.get(j) > DNI.get(j + 1)) {
		            // Intercambiar elementos
		            int temp = DNI.get(j);
		            DNI.set(j, DNI.get(j + 1));
		            DNI.set(j + 1, temp);
		        }
		    }
		}

		System.out.println("su lista de DNI quedo asi: \n" + DNI);
		
		for (int i = 0; i < DNI.size() - 1; i++) {
            for (int j = 0; j < DNI.size() - i - 1; j++) {
                if (DNI.get(j) < DNI.get(j + 1)) {
                    int temp = DNI.get(j);
                    DNI.set(j, DNI.get(j + 1));
                    DNI.set(j + 1, temp);
                }
            }
        }

        System.out.println("su lista de DNI quedo asi: " + DNI);
    }

}
