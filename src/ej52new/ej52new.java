package ej52new;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ej52new {
	
	static Scanner datos = new Scanner (System.in);
	
	public static void AnalizarDescuento(float costo) {
		
		if( costo > 15000 ) {
			
			float descuento = (costo);
			System.out.println("se aplico un 10% de descuento $" + descuento);
			float costofinal = costo - descuento;
			System.out.println("el monto total es: " + "$" + costofinal);
			
		} else {
			System.out.println("el costo total es " + "$" + costo);
		}
		
	}
	
	public static float ingresarCosto() {
		System.out.println("ingresar el monto de dinero: ");
		float costoInicial = datos.nextFloat();
		
		return costoInicial;
	}

	public static void main() {
		
		
//		AnalizarDescuento(28000);
//		System.out.println("");
//		AnalizarDescuento(11000);
//		System.out.println();
		
		AnalizarDescuento( ingresarCosto( ) );
		
	}
	
}
