package ej53;

import java.util.Scanner;

public class ej53 {
	
	static Scanner datos = new Scanner (System.in);
	static int notamin = 9999, notamax = -9999;
	static int nota1;
	static int nota2;
	static int nota3;
	static int nota4;
	static int nota5;
	
	public static void Ingreso_de_notas() {
		System.out.println("ingre la primara nota");
		nota1 = datos.nextInt();
		System.out.println("Ahora ingre la segunda nota");
		nota2 = datos.nextInt();
		System.out.println("La tercera nota");
		nota3 = datos.nextInt();
		System.out.println("La cuarta nota");
		nota4 = datos.nextInt();
		System.out.println("Y por ultimo la quinta");
		nota5 = datos.nextInt();
	}
	public static void SumaDeNotas() {
		int suma;
		int divi;
		suma = nota1 + nota2 + nota3 + nota4 + nota5;
		divi = suma / 5;
		System.out.println("este fue el promedio de las nota:\n " + divi);
	}
	
	
	
	

	public static void main(String[] args) {
		Ingreso_de_notas();
		SumaDeNotas();
	}

}
