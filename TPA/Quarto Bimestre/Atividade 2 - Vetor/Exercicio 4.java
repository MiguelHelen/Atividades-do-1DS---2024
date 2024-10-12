/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

import javax.swing.JOptionPane;
import java.util.Collections;
import java.util.Arrays;
/**
 *
 * @author migue
 */
public class Main {
    
   public static void main(String[] args){
    
    Integer[] numeros = new Integer[50];
        
        
        for (int i = 0; i < 50; i++) {
            String input = JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número:");
            numeros[i] = Integer.parseInt(input);  
        }
        
        
       Arrays.sort(numeros, Collections.reverseOrder());        
        
        for (int i = 0; i < 50; i++) {
           System.out.println((i + 1) + "° número: " + numeros[i]); 
        }
    
    } 
}
