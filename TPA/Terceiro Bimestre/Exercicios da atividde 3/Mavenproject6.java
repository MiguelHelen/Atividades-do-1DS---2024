/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project6;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insire sua idade: ");
        int i = sc.nextInt();
        
        if(i >=5 && i <= 7){
        System.out.print("Infantil A");
        }
        
        else if(i >= 8 && i <= 10 ){
        System.out.print("Infantil B");
        }
        
        else if (i >= 11 && i <= 13){
        System.out.print("Juvenil A");
        }
        
        else if(i >= 14 && i <= 17){
        System.out.print("Juvenil B");
        }
        
        else if(i >= 18) {
        System.out.print("Sênior");
        }   
    }
}
