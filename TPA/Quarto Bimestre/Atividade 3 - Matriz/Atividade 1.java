/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.matriz;

 import java.util.Scanner;
 
 /**
  *
  * @author migue
  */
 public class Matriz {
 
     public static void main(String[] args) {
         
       int[][] matriz = new int[5][5];
       
       Scanner sc = new Scanner(System.in);
         
         
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++) {
                 System.out.print("Digite o valor para a posição (" + (i+1) + ", " + (j+1) + "): ");
                 matriz[i][j] = sc.nextInt();
             }
         }
 
         
         int somaImpares = 0;
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++) {
                 if (matriz[i][j] % 2 != 0) {
                     somaImpares += matriz[i][j];
                 }
             }
         }
         System.out.println("Soma dos números ímpares: " + somaImpares);
 
         
         System.out.println("Soma de cada coluna:");
         for (int j = 0; j < 5; j++) {
             int somaColuna = 0;
             for (int i = 0; i < 5; i++) {
                 somaColuna += matriz[i][j];
             }
             System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
         }
 
         
         System.out.println("Soma de cada linha:");
         for (int i = 0; i < 5; i++) {
             int somaLinha = 0;
             for (int j = 0; j < 5; j++) {
                 somaLinha += matriz[i][j];
             }
             System.out.println("Linha " + (i + 1) + ": " + somaLinha);
         }
  
     }
 }
 