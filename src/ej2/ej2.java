package ej2;
import java.util.Scanner;

public class ej2 {
 public static void main(String[] args) {
	Scanner datos = new Scanner (System.in);
	
	float num1, num2;
	
	String nombre;
	
	System.out.println("ingrese su nombre");
	nombre = datos.next();
	
	System.out.println("ingrese su numero");
	num1 = datos.nextFloat(); 
	
	System.out.println("ingrese su numero");
	num2 = datos.nextFloat();
	
	float suma = num1 + num2;
	int sumaInt = (int) suma; 
	
	float multi = num1 * num2;
	int multiInt = (int) multi;
	
	float resta = num1 - num2;
	int restaInt = (int) resta;
	
	float divi = num1 / num2;
	int diviInt = (int) divi;
	
	
	System.out.println("el resultado de la suma es: " + suma );
	System.out.println("el resultado de la suma entera es: " + sumaInt );
	
	System.out.println("el resultado de la resta es: " + resta );
	System.out.println("el resultado de la resta entera es: " + restaInt );
	
	System.out.println("el resultado de la multiplicasion es: " + multi );
	System.out.println("el resultado de la smultiplicasion entera es: " + multiInt );
	
	System.out.println("el resultado de la division es: " + divi );
	System.out.println("el resultado de la division entera es: " + diviInt );
	
	
}
}
