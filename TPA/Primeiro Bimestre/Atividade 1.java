package media;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double  x,y; 
		
		System.out.print("Digite a primeira nota:"); 
		x = sc. nextDouble(); 
		
		System.out.print("Digite a segunda nota :");
        y = sc. nextDouble();
        
        double média = (x + y) /2; 
        
        System.out.println(" A primeira nota é :" + x); 
        System.out.println(" A segunda nota é :" + y);		
        System.out.println("A média das notas é: " + média);
        
        
        
	}

}
