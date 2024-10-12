    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     */

     package com.mycompany.vetor;

     import javax.swing.JOptionPane;
     import java.util.Arrays;
 
     /**
      *
      * @author migue
      */
     public class Vetor {
 
         public static void main(String[] args) {
 
             String[] nomes = new String[15];
 
             int i;
 
             for(i = 0; i < 15; i++){
 
             nomes[i] = JOptionPane.showInputDialog("Digite o " +(i + 1) + "° nomes:");
             }
             Arrays.sort(nomes);
 
             for(i = 0; i < 15; i++){
                 System.out.println((i + 1) + "° nome: " + nomes[i]);
             }
         }
     }
 
