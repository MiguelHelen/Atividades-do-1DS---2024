/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.mavenproject2;

 import java.util.Scanner;
 
 /**
  *
  * @author migue
  */
 public class Mavenproject2 {
 
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Quantiadde em kg de peixe:");
         Double p = sc.nextDouble();
         
         double q = 100;
         double menos;
         double multa;
         
         if (p <= 100) {
             
         menos = p - q;
         System.out.print("Não passou do limite em kg de peixe por pessoa");
         }
         else {
             
         menos = p - q;
         multa = menos * 8;
         System.out.printf("A multa ficou em : %.2f%n" , multa);
         }
     }
 }
 