package ej24;
import java.util.Scanner;

public class ej24 {
	public static void main(String args[]) throws InterruptedException {
	Scanner datos = new Scanner (System.in) ;
	
	boolean quierosalir = false; 
	int salir;
	int num , nume;
	 
	do {
		
	System.out.println("ingrese un numero");
	num  = datos.nextInt();
	nume  = datos.nextInt();
	
	 float suma = num + nume; 
	
	System.out.println("su suma es: " + suma);
	
	System.out.println("si quiere salir aprete 0");
	salir = datos.nextInt();
	
	
	if ( salir != 0) {
		System.out.println("si desea seguir sumado apriete cualquier otro numero distinto de cero");
		quierosalir = false;
	}
	
	
	}while (salir == 0); 
	if (salir == 0) {
	System.out.println("ya no puede seguir sumando");
	quierosalir = true;
	}
	
	
	}
  }
