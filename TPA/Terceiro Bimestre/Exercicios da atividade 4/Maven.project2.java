package laço.de.repetição.ativ2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Informe um número");
    int numero = sc.nextInt();
    
    int tabuada;
	
	for(int i = 0; i<11; i++ ) {
		
		tabuada = i * numero;
		
		System.out.println(tabuada);
		
		
	}
		

	}

}

