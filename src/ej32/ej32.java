package ej32;
import java.util.Scanner;
public class ej32 {
	public static void main(String args[]) throws InterruptedException {
	Scanner datos = new Scanner (System.in) ;
	
	int i, resultado, eje;
	System.out.println("ingreese un numero:");
	eje  = datos.nextInt();
	
	for (i = 1; i <= 20; i++) {
		
		resultado = eje * i;
		
		System.out.println(eje + " * " + i + " = " + resultado);
		
		
		
	}
 }
}