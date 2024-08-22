/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;
 

 import java.util.Scanner;
 
 /**
  *
  * @author migue
  */
 public class Mavenproject1 {
 
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Digite a primeira nota:");
         double n1 = sc.nextDouble();
         
         System.out.print("Digite a segunda nota:");
         double n2 = sc.nextDouble();
         
         System.out.print("Digite a terceira nota:");
         double n3 = sc.nextDouble();
         
         System.out.print("Digite a quarta nota:");
         double n4 = sc.nextDouble();
         
         System.out.print("Digite a quinta nota:");
         double n5 = sc.nextDouble();
         
         Double media = (n1 + n2 + n3 + n4 + n5) / 5;
         
         if (media > 5){
         System.out.print("Foi aprovado com média maior que 5");
         }
         else {
         System.out.print("Você foi reprovado");
         }
                 
     }
 }
 
