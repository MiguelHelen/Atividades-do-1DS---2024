/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.project;

 import java.util.Scanner;
 
 /**
  *
  * @author migue
  */
 public class Project {
 
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Inicio do Turno:");
         double t = sc.nextDouble(); 
         
         if (t >= 5 && t < 13){
         System.out.print("Manhã");
         }
         if  (t >= 13 && t < 21 ){
             System.out.print("Tarde");
     }
         if( t >= 21 && !(t > 24) || t < 5) {
             System.out.print("Noite");
         
         }
     }
 }
 
