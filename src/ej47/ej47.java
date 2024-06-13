package ej47;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej47 {

	public static void main(String[] args) {

		  Scanner Entrada = new Scanner(System.in);
		  
		  ArrayList<String> nombresSocios = new ArrayList<>();
		  	nombresSocios.add("Enrique");
			nombresSocios.add("Liliana");
			nombresSocios.add("Lucas");
			nombresSocios.add("Juan");
			nombresSocios.add("Fiorella");
			nombresSocios.add("Ariel");
			nombresSocios.add("Daiana");

			List<Integer> numerosSocios = new ArrayList<>();
			numerosSocios.add(1011);
			numerosSocios.add(2367);
			numerosSocios.add(8748);
			numerosSocios.add(9121);
			numerosSocios.add(817);
			numerosSocios.add(6423);
			numerosSocios.add(2034);

			System.out.println("Elija una opcion:");
			System.out.println("1. Borrar");
			System.out.println("2. Modificar");

			int opcion = Entrada.nextInt();

			boolean quiereSalir = false;

			if (opcion == 1) {


				System.out.println("Ingrese el numero de socio a borrar: ");
				System.out.println(numerosSocios);


				int numeroDeSocioABorrar = Entrada.nextInt();

				int posicionEnLaLista = numerosSocios.indexOf(numeroDeSocioABorrar);

				numerosSocios.remove(posicionEnLaLista);
				nombresSocios.remove(posicionEnLaLista);

				System.out.println("Listado de numeros de socios: " + numerosSocios);
				System.out.println("Listado de nombres de socios: " + nombresSocios);

			} else if (opcion == 2) {

				System.out.println("Ingrese el numero de socio a modificar: ");
				System.out.println(numerosSocios); 

				int numeroDeSocioAModificar = Entrada.nextInt();


				int posicionEnLaLista = numerosSocios.indexOf(numeroDeSocioAModificar);

				System.out.println("Ingrese el nuevo nombre: ");
				String nuevoNombre = Entrada.next();
				
				System.out.println("Ingrese el nuevo numero: ");
				int nuevoNumero = Entrada.nextInt();
				
				nombresSocios.set(posicionEnLaLista, nuevoNombre );
				numerosSocios.set(posicionEnLaLista, nuevoNumero);
				

				System.out.println("Listado de numeros de socios: " + numerosSocios);
				System.out.println("Listado de nombres de socios: " + nombresSocios);
			
			}
	
		
	}

}
