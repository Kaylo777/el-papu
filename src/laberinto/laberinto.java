package laberinto;

import java.util.Scanner;

public class laberinto {

	public static void main(String[] args) {
	
		Scanner Entrada = new Scanner(System.in);
		  
		int opcion  ;
		
		int movimientoD = 0;
		int movimientoI = 0;
		int movimientoA = 0;
		int movimientoB = 0;
		
		System.out.println(" HOLA usted ah despertado en nuestro laberinto \n");
		System.out.println("si desea escapar tendra que encontrar la salida por su propia cuenta \n");
		System.out.println("¿Y que va hacer? \n");
		
		System.out.println("respuesta 1: como esta muchacho = 1, respuesta 2 : bueno empecemos, ademas no me acuerdo si cerre el gas = 2 \n");
		opcion = Entrada.nextInt();
		
		
		if(opcion == 1 ) {
			System.out.println("Naaaa bueno mira el tontito que me toco");
		}else if(opcion == 2 ) {
			System.out.println("UY bueno dela empesa que se te quema la casa");
		}else {
			System.out.println("EHHH que digiste volve a reperirlo");
			System.out.println("respuesta 1: como esta muchacho = 1, respuesta 2 : bueno empecemos ademas no me acuerdo si cerre el gas");
			opcion = Entrada.nextInt();
			
		}
		
		
		
	}

}
