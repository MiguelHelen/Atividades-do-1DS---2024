/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project5;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a primeira nota:");
        double n1 = sc.nextDouble();
    
        System.out.print("Informe a segunda nota:");
        double n2 = sc.nextDouble();
    
        System.out.print("Informe a terceira nota:");
        double n3 = sc.nextDouble();
        
        System.out.print("Informe a quarta nota:");
        double n4 = sc.nextDouble();
        
        double media = (n1 + n2 + n3 + n4) / 4;
        
        if(media >= 9){
        System.out.print("Aprovado");
        }
        else if (media >= 7 && media < 9){
        System.out.print("Aprovado");
        }
        else if (media >=5 && media < 7)  {
        System.out.print("Aprovado");
        }    
        else if (media >= 2.5 && media < 5){
        System.out.print("Reprovado");
        }
        else{
        System.out.print("Reprovado");
        }
    }
    
}
