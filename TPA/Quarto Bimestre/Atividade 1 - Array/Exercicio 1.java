/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.arrays;


 import java.util.Scanner;
 import java.util.Arrays;
 
 /**
  *
  * @author migue
  */
 public class Main {
 
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         String[] nomes = new String[10];
         
         System.out.println("Digite 10 nomes: ");
         
         for(int i = 0; i< nomes.length; i++){
         
             System.out.print("Nome " + (i + 1) + ": ");
              nomes[i] = sc.nextLine();
         }
        
        
         Arrays.sort(nomes);
         
         System.out.println("\n Nomes em ordem crescente:");
         
         for(String nome :  nomes ){
             System.out.println(nome);
         
         }
         
     }
 }
 
