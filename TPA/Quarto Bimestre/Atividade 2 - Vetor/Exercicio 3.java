/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args){
    
    int[] numeros = new int[5];
        
        
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número:");
            numeros[i] = Integer.parseInt(input);  
        }
        
        
        Arrays.sort(numeros);
        
        for (int i = 0; i < 5; i++) {
           System.out.println((i + 1) + "° número: " + numeros[i]); 
        }
        
        
    
    
    }
    
}

