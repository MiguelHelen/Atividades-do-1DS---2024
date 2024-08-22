/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite a opção:" );
        int o = sc.nextInt();
        
         switch(o) {
             
             case 1: 
                 System.out.print("BigMac");
                 break;
                 
             case 2: 
                 System.out.print("Quarteirão");
                 break;
                 
             case 3: 
                 System.out.print("MacChicken");
                 break;
                 
             case 4: 
                 System.out.print("Cheddar");
                 break;
                 
             case 5: 
                 System.out.print("Cheese burger");
                 break;
    }
    
    }
}
