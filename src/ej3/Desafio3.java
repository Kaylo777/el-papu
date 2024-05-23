/*Se debe generar un programa que almacene la informaci�n de varios libros. El programa debe ser eficiente, es decir, se deben incluir los temas vistos en el a�o. 
Crear una clase llamada Libro que contenga los siguientes atributos:
T�tulo del libro
Autor del libro
N�mero de p�ginas

Crear arreglos para almacenar los datos de los libros. Esta lista representar� la colecci�n de libros en la biblioteca. El programa debe mostrar un men� con las siguientes opciones:
Mostrar lista de libros: El programa debe mostrar la lista de libros registrados en la biblioteca, incluyendo el t�tulo, autor y n�mero de p�ginas de cada libro.
Buscar un libro por t�tulo: El usuario debe ingresar el t�tulo del libro y el programa debe buscar y mostrar los libros que coincidan con el t�tulo.
Salir: Terminar el programa.
El programa debe ser capaz de manejar excepciones, como entradas no v�lidas o valores negativos para el n�mero de p�ginas.
Aseg�rate de que el programa permita al usuario realizar varias operaciones antes de salir.*/
package ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio3 {

	static int opcion;
	static char volver;
	static char salir;
	static boolean regresar = true;
	static boolean busqueda = false;
	static String buscar;
	static String Titulo_libro[] = { "Crimen y castigo", "Las aventuras de Alicia en el pa�s de las maravillas",
			"A trav�s del espejo y lo que Alicia encontr� all�" };
	static String Autor_libro[] = { "Fi�dor Dostoyevski", "Lewis Carroll", "Lewis Carroll" };
	static int Paginas[] = { 650, 208, 240 };

	public static void Menu() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("\tMenu Biblioteca");
		System.out.println("Opcion 1: Lista Libros");
		System.out.println("Opcion 2: Buscar Libro");
		System.out.println("Opcion 3: Salir");

		try {
			System.out.println("\nSeleccione la opcion: ");
			opcion = entrada.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Error: Dato invalido.");
			entrada.nextLine();
		}
	}

	public static void Lista_Libros() {
		System.out.println("\tLista de libros");

		for (int i = 0; i < 3; i++) {
			System.out.println("Nombre: " + Titulo_libro[i]);
			System.out.println("Autor: " + Autor_libro[i]);
			System.out.println("Cant. Paginas: " + Paginas[i]);
			System.out.println("");
		}

	}

	public static void Buscar_Libro() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nIngrese el nombre del libro: ");
		buscar = entrada.nextLine(); // Almacenamos TODA la frase incluyendo los espacios.

		for (int i = 0; i < Titulo_libro.length; i++) {
			if (Titulo_libro[i].equalsIgnoreCase(buscar)) {
				System.out.println("\nEl libro est� en la biblioteca");
				busqueda = true;
			}
		}
		if (!busqueda) {
			System.out.println("El libro no est� en la biblioteca");
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		while (regresar == true) {
			Menu();
			switch (opcion) {

			case 1:
				Lista_Libros();

				try {
					System.out.println("Desea volver al menu? (s/n): ");
					volver = entrada.next().charAt(0);
					if (volver != 's' && volver != 'n') {
						throw new InputMismatchException();
					}
				} catch (InputMismatchException e) {
					System.out.println("Error: Dato invalido.");
					entrada.nextLine();
				}
				if (volver == 's') {
					regresar = true;
				} else {
					System.out.println("Programa finalizado.");
					regresar = false;
				}
				break;

			case 2:
				Buscar_Libro();

				try {
					System.out.println("Desea volver al menu? (s/n): ");
					volver = entrada.next().charAt(0);
					if (volver != 's' && volver != 'n') {
						throw new InputMismatchException();
					}
				} catch (InputMismatchException e) {
					System.out.println("Error: Dato invalido.");
					entrada.nextLine();
				}
				if (volver == 's') {
					regresar = true;
				} else {
					System.out.println("Programa finalizado.");
					regresar = false;
				}
				break;

			case 3:
				System.out.println("Desea salir? (s/n): ");
				salir = entrada.next().charAt(0);
				if (salir == 's') {
					System.out.println("Programa finalizado.");
					regresar = false;
				} else {
					regresar = true;
				}
				break;
			default:
				System.out.println("No existe esa opcion");
				try {
					System.out.println("Desea volver al menu? (s/n): ");
					volver = entrada.next().charAt(0);

					if (volver != 's' && volver != 'n') {
						throw new InputMismatchException();
					}
				} catch (InputMismatchException e) {
					System.out.println("Error: Dato invalido.");
					entrada.nextLine();
				}

				if (volver == 's') {
					regresar = true;
				} else {
					System.out.println("Programa finalizado.");
					regresar = false;
				}

			}

		}
	}
}
