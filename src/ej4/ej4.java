package ej4;
import java.util.Scanner;
public class ej4 {
	
 public static void main(String[] args) {
	 Scanner datos = new Scanner(System.in);
	 int ano, mes, semana, dia;
	 
	 System.out.println("ingrese los años: \n");
	 ano = datos.nextInt();
	 System.out.println("ingrese los meses: \n");
	 mes = datos .nextInt();
	 System.out.println("ingrese las semanas: \n");
	 semana = datos.nextInt();
	 
	 dia = ano*365 + mes*30 + semana*7;
	 
	 System.out.println("su cantidad de dias es: " + dia);
	 
			 
	 
	 
}
}
