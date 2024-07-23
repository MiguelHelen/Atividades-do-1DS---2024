package provateorica1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print(" Informe seu produto:");
		String produto = sc.next();  
		
		
		System.out.println(" Valor do produto:  ");
		float valor = sc.nextFloat(); 
		
		
		System.out.print(" Informe sua cidade :"); 
	    String cidade = sc.next(); 
	   
		
		float porcentagem = ( 5 * 100 )  /valor;
		float adicao = valor + porcentagem; 
		
		if ( cidade == " SãoPaulo" ) {
			System.out.println("Frete grátis, seu valor final é " + valor);
		} else if  (cidade == "Taboão da Serra" + "Embú das artes") { 
			System.out.println(" Seu frete é " + porcentagem + " O valor total foi de " + adicao );
		}
		
				
		
		
		 

	}

}
