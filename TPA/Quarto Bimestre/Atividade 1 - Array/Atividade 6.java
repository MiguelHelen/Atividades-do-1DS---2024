/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args){
    
     Scanner sc = new Scanner(System.in);
        
  int[] numeros = new int[5];
  
   System.out.println("Digite 100 Números");

    for(int i = 0; i< numeros.length; i++){

System.out.print("Numero " + (i + 1) + ": ");

numeros[i] = sc.nextInt();
}

 Arrays.sort(numeros);
 


    
System.out.println("\n Números pares: ");

for(int i = 0; i< numeros.length; i++){

if(numeros[i] % 2 !=0){

    System.out.println(numeros[i]);
}

}
    }   
}
    


