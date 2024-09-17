package laço.de.repetição;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double mod;
		
		for(int i = 5; i < 3999; i++ ) {
			
			mod = i % 2;
			
			if(mod == 0) {
				System.out.println(i);
			}
		}
		

	}

}

