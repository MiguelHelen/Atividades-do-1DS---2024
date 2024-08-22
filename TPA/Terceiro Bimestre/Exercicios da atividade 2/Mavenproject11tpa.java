/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.mavenproject1.tpa;

 import java.util.Scanner;
 
 /**
  *
  * @author migue
  */
 public class Mavenproject11tpa {
 
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Tente acertar o número que estou pensando entre 0 e 50");
         System.out.print("Número:");
         double numero = sc.nextDouble();
         
         while(numero != 44){
         
         if(numero >= 0 && numero <= 10){
         System.out.print("O número que estou pensando não está entre 0 e 10");
         } 
         
         else if(numero >= 11 && numero <= 20){
         System.out.print("O Número que estou pensando não está entre 11 e 20");
         }
         
         else if(numero >= 21 && numero <= 30){
         System.out.print("O Número que estou pensando não está entre 21 e 30");
         }
         
         else if(numero >= 31 && numero <= 40){
         System.out.print("O Número que estou pensando não está entre 31 e 40");
         }
         
         else if(numero >= 41 && numero <= 45){
         System.out.print("O Número que estou pensando está entre 41 e 45");
         }
         
         else if(!!(numero != 46 || numero != 47 || numero != 48 || numero != 49 || numero != 50 )){
         System.out.print("O número que estou pensando não está entre 46 e 50");
         }
         else {
         System.out.print("Na próxima digite um número entre 0 e 50");
         }
         System.out.println();
         System.out.println();
         System.out.print("Digite outro número:");
         numero = sc.nextDouble();
         
         
         }
         System.out.println();
         
         System.out.println("Acertou!!! Parabéns");
     }
 }
 