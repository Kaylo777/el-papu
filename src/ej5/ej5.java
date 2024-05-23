package ej5;
import java.util.Scanner;
public class ej5 {
	
 public static void main(String[] args) {
	 
	 Scanner entrada = new Scanner (System.in) ;
	 
	 float primernum;
	 
	 System.out.println("ingrese el numero para la raiz");
	 
	 primernum = entrada.nextFloat();
	 
	 double raiz_cuadrada = Math.sqrt(primernum);
	 
	 System.out.println("la raiz de su numero es: " + raiz_cuadrada);
	
	 
 }

}
