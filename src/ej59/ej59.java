package ej59;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ej59 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int edad;
		
	try {
		System.out.println("cuantos años tenes chabon");
		edad = datos.nextInt();
		
		
			if (edad < 0) {
				System.out.println("el valor iniciado de es valido");
				throw new Exception();
			}else if(edad == 0) {
				System.out.println("el valor no es valido");
				throw new Exception();
			}else if (edad != 0 ) {
				System.out.println("su edad es :" + edad);
			}else {
				System.out.println("no se pueden ingresar caracteres");
				throw new Exception();
			}
			
	} catch (Exception e) {
		System.err.println("Error: " + e.getMessage());
		
	} 

	}
}