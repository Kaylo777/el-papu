package ej50;

import java.util.Scanner;

public class ej50 {
	static Scanner entrada = new Scanner(System.in);
	static String apellido;
	static float altura = 1.8f;
	
	public static void Ingresar_Nombre() {
		Scanner datos = new Scanner(System.in);
		System.out.println("Ingrese su nombraso: ");
		String nombre = datos.next();
		System.out.println("Ingrese su apellidardo: ");
		apellido = entrada.next();
	}
	public static float Almacenar_Altura(float A) {
		A = altura;
		return A;
	}
	public static int Filtrar_Edad(int edad) {
			if (edad >= 18 ) {
				return edad;
			}else
				return -1;	
				
	}
	
    public static boolean analizarSiTrabaja (String respuesta) {
       
        if (respuesta.equalsIgnoreCase("si")) {
            return true;
        } else {
            return false;
        }
       
       
    }
   
    public static void cantidadAnimales(int gatos, int perros) {	
        System.out.println("La cantidad de perros es: "+ perros);
        System.out.println("La cantidad de gatos es: "+ gatos);
    }

	
	public static void main(String[] args) {
		Ingresar_Nombre();
		System.out.println( Almacenar_Altura(altura));
		//no sebas no tiene nada papu :)(:[ ]: °_° QwQ BVB
		//COMO PIERDES UN PARTIDO CONTRA QATAR
		Almacenar_Altura(altura);
		Filtrar_Edad(25);
	}

}
