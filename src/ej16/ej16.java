package ej16;
import java.util.Scanner;

public class ej16 {
	public static void main(String[] argts ) {
		Scanner datos = new Scanner (System.in) ;
		
		int ok;
		int si;
		int no;
		
		
		System.out.println("pone ingrese la hora, sos chistos");
		ok = datos.nextInt();
		
		
		if ( ok <= 24) {
		System.out.println("te quiero sebas \n" + ok);	
		}else if (ok > 24) {
			System.err.println("el valor es incorrecto, mdd");
		}
		
		System.out.println("ingrese los minutos");
		si = datos.nextInt();
		
		if (si <= 60) {
			
			System.out.println("te quiero luis: " + si);
		}else if (si > 60) {
			System.err.println("este valorcito es una cagada");
		}
		
		System.out.println("ahora ingrese los segundos");
		no = datos.nextInt();
		
		
		if (no <= 60) {
			System.out.println("te quiero sergio: " + ok  +  si  +  no);
		}else if (no > 60 ) {
			System.err.println("apa y esos segundos");
		}
		
	}
}
