package ej17;
import java.util.Scanner;

public class ej17 {
	public static void main(String[] argts ) {
		Scanner datos = new Scanner (System.in) ;
		
		int n1 , n2 , n3;
		
		System.out.println("ingrese un numero");
		n1 = datos.nextInt();
		
		System.out.println("ingrese un numero");
		n2 = datos.nextInt();
		
		System.out.println("ingrese un numero");
		n3 = datos.nextInt();
		
		
		
		if (n1 > n2 && n2 >  n3) {
			System.out.println("tu numero es tal tal cosa, INVENTAAAA!!!! \n" + n1  + "aca podes seguir escribiendo segui *mira a tito* \n" + n2 + "pone segui dale dale dale ay dios \n" + n3);
		}
		if (n1 > n3 && n3 > n2) {
			System.out.println("tu numero es tal tal cosa, INVENTAAAA!!!! \n" + n1 + "aca podes seguir escribiendo segui *mira a tito* \n" + n3 + "pone segui dale dale dale ay dios \n" + n2);
		}
		if (n2 > n1 && n1 >  n3) {
			System.out.println("tu numero es tal tal cosa, INVENTAAAA!!!! \n" + n2 + "aca podes seguir escribiendo segui *mira a tito* \n" + n1 + "pone segui dale dale dale ay dios \n" + n3);
		}
		if (n2 > n3 && n3 >  n1) {
			System.out.println("tu numero es tal tal cosa, INVENTAAAA!!!! \n" + n2 + "aca podes seguir escribiendo segui *mira a tito* \n" + n3 + "pone segui dale dale dale ay dios \n" + n1);
		}
		if (n3 > n1 && n1 >  n3) {
			System.out.println("tu numero es tal tal cosa, INVENTAAAA!!!! \n" + n3 + "aca podes seguir escribiendo segui *mira a tito* \n" + n1 + "pone segui dale dale dale ay dios \n" + n3);
		}
		if (n3 > n2 && n2 >  n1) {
			System.out.println("tu numero es tal tal cosa, INVENTAAAA!!!! \n" + n3 + "aca podes seguir escribiendo segui *mira a tito* \n" + n2 + "pone segui dale dale dale ay dios \n" + n1);
		}
		
	}
}
	