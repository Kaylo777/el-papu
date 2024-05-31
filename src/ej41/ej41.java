package ej41;

import java.util.Scanner;

public class ej41 {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner (System.in) ;
		
		String[] nombre = new String[10];
		
		nombre [0] ="Messi";
		nombre [1] ="Maradona";
		nombre [2] ="Aimar";
		nombre [3] ="Gallardo";
		nombre [4] ="Palermo";
		nombre [5] ="Riquelme";
		nombre [6] ="Vagoneta";
		nombre [7] ="Eito";
		nombre [8] ="Leybovich";
		nombre [9] ="Raffo";
		
		for(int i = 0; i < 9; i++) {

			System.out.println("el nombre del jugador es: " + nombre[i] + "\n");
			Thread.sleep(20);
		}
		
		}
		
	}


