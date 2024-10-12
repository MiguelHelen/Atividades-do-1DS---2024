/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args){
    
    
    String[] nomes = new String[15];
        
        int i;
        
        for(i = 0; i < 15; i++){
        
        nomes[i] = JOptionPane.showInputDialog("Digite o " +(i + 1) + "° nomes:");
        }
        
       Arrays.sort(nomes, Collections.reverseOrder());
        
        for(i = 0; i < 15; i++){
            System.out.println((i + 1) + "° nome: " + nomes[i]);
        }
    
    
    }
    
}

