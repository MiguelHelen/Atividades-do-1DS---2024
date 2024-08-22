/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project4;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número entre 1 e 12" );
        int m = sc.nextInt();
        
        switch(m) {
        
            case 1: 
                System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Janeiro");
        break;
        
            case 2: 
                System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Fevereiro") ;
        break;
        
            case 3: 
                System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Março") ;
        break;
        
            case 4: 
                System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Abril") ;
        break;
        
            case 5: 
                System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Maio") ;
        break;
        
            case 6: 
                System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Junho") ;
        break;
        
            case 7: 
                System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Julho") ;
        break;
        
            case 8: 
                System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Agosto") ;
        break;
        
            case 9: 
                System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Setembro") ;
        break;
        
           case 10: 
                System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Outubro") ;
        break;
        
           case 11: 
                System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Novembro") ;
        break;
        
           case 12: 
                System.out.print("Você digitou o número: " + m + " Que Corresponde o mês de Dezembro") ;
        break;
        
        }
    }
    
}

