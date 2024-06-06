package ej45;

public class ej45 {

	public static void main(String args[]) throws InterruptedException {
		
		int[] nums = new int[7];
	
		
	//	Esos números, deben estar asociados a los siguientes nombres: Enrique
	//	(1011), Liliana (2367), Lucas (8748), Juan (9121), Fiorella (0817), Ariel (6423),
	//	y Daiana (2034).
		
		nums[0] = 1011;
		nums[1] = 2367;
		nums[2] = 8748;
		nums[3] = 9121;
		nums[4] = 817;
		nums[5] = 6423;
		nums[6] = 2034;
		
		
		System.out.println("el codigo de Enrique es: " + nums[0]);
			Thread.sleep(20);
		System.out.println("el codigo de Liliana es: " + nums[1]);		
			Thread.sleep(20);
		System.out.println("el codigo de Lucas es: " + nums[2]);
			Thread.sleep(20);
		System.out.println("el codigo de  Juan es:" + nums[3]);
			Thread.sleep(20);
		System.out.println("el codigo de Fiorella es: " + nums[4]);
			Thread.sleep(20);
		System.out.println("el codigo de Ariel es: " + nums[5]);
			Thread.sleep(20);
		System.out.println("el codigo de  Daiana es: " + nums[6]);
			Thread.sleep(20);
		

	}

}
