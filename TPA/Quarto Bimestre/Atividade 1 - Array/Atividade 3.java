/* 
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

import java.util.Scanner;
import java.util.Arrays;


/**
 *
 * @author migue
 */
public class Main {
    public static void main(String[] args){
        
      Scanner sc = new Scanner(System.in);
        
  int[] numeros = new int[50];
  
System.out.println("Digite 50 Números");

for(int i = 0; i< numeros.length; i++){

System.out.print("Numero " + (i + 1) + ": ");

numeros[i] = sc.nextInt();
}

Arrays.sort(numeros);

for(int numero: numeros){
System.out.println(numero);
}
  
    }
}