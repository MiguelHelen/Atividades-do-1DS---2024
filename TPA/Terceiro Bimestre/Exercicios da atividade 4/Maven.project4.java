package laço.de.repetição.ativ4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor Inicial:");
		int vi = sc.nextInt();
		
		System.out.print("Valor Final:");
		int vf = sc.nextInt();
		
		int sub = vf - vi;  
		int somaSub1 = 0;
		
		
		for(int i =1; i<= sub; i++) {
			
			int sub1 = sub -i;
			
			int mod = sub1 % 2;
			
			
			if(mod != 0) {
					
				
				somaSub1 += sub1;
				
			}
			
		
		}
		
		System.out.println(somaSub1);

	}

}

