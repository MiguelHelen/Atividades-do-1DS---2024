package laço.de.repetição.ativ4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor inicial: ");
        int vi = sc.nextInt();
        
        // Solicita o valor final
        System.out.print("Digite o valor final: ");
        int vf = sc.nextInt();
        
       
        int zero = 0;

        
        for (int i = vi; i <= vf; i++) {
            if (i % 2 != 0) {  
                zero+= i;
            }
        }
        System.out.println("A soma dos números ímpares é: " + zero);

	}

}

