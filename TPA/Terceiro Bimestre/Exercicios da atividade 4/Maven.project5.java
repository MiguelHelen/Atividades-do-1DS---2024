package laço.de.repetição.ativ5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.print("Digite o número1: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o número2: ");
        int n2 = sc.nextInt();

        
        for (int i = n1; i <= n2; i += 2) {
        	
            System.out.println(i);
        }
        
        
        if (n1 % 2 == 0) {
        	
            n1++; 
        }


	
	}}
	
	



