/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.mavenproject3;

 import java.util.Scanner;
 
 /**
  *
  * @author migue
  */
 public class Mavenproject3 {
 
     public static void main(String[] args) {
        
         Scanner sc = new Scanner (System.in); 
         
         System.out.print("Digite o dia que você nasceu:");
         double d = sc.nextDouble();
         
         System.out.print("Digite o mês que você nasceu:");
         double m = sc.nextDouble();
         
         System.out.print("Digite o ano que você nasceu:");
         double a = sc.nextDouble();
         
        
         double ano = 2024 - a;
          
         
         
         if(ano < 18 ) {
         System.out.print("VOCÊ É MENOR DE IDADE;");
         }
         
         if (ano <= 18 && m == 7 && d > 28) {
             System.out.println("VOCÊ É MENOR DE IDADE;");
         
         if (ano <= 18 && m >=8 || d == 29 || d == 30 || d == 31) {
             System.out.println("VOCÊ É MENOR DE IDADE;");
         }
         }
         
         
         if  (ano == 18 && d <=28 && m <=07 ) {
             
             System.out.println(" ATINGIU A MAIORIDADE;");
             
             
         if (ano == 18  && d== 29 || d== 30 || d==31 && m < 7 ) {
             System.out.println(" ATINGIU A MAIORIDADE;");
         }
         
             
         }
          if (ano == 19 && d <= 27 && m >=07 ){
          System.out.print(" ATINGIU A MAIORIDADE;");
          }
          
          if (ano == 19 && d > 27 && m >07){
          System.out.println("ATINGIU A MAIORIDADE;");
          }
         
         if (ano == 60 && d <= 26 && m <= 07) {
             
             System.out.println("VOCÊ É IDOSO;");
         }
        
        if(ano == 61 && d <= 31 && m > 07){
          System.out.print("VOCÊ É IDOSO;");
        }
         
         if (ano == 61 && d <= 27 && m == 7){
         System.out.println("VOCÊ É IDOSO;");
         }
         
     }
 }
 
