/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author migue
 */
public class Main {
    public static void main(String[] args){
    
     Scanner sc = new Scanner(System.in);
        
  Integer[] numeros = new Integer[50];
  
   System.out.println("Digite 50 Números");

    for(int i = 0; i< numeros.length; i++){

System.out.print("Numero " + (i + 1) + ": ");

numeros[i] = sc.nextInt();
}

 Arrays.sort(numeros, Collections.reverseOrder());

for(int numero: numeros){
System.out.println(numero);
}
    
    }  
}

