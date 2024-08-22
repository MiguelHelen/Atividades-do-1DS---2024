/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;
import java.util.Scanner;


/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args) {
        
       
  
    Scanner sc = new Scanner (System.in);
    
    System.out.print("informe sua massa em kg:");
    double m = sc.nextDouble();
    
    System.out.print("Informe sua altura em metros:");
    double a = sc.nextDouble();
    
    double imc = m / ( a * a) ;
    
    if(imc < 18){
    System.out.print("Magreza");
    }
    
    else if (imc > 18.0 && imc <= 24.9) {
        System.out.print("Saudável");
        } 
  
    else if (imc > 25.0 && imc < 29.9 ){
    System.out.print("Sobrepeso");
    }
    else if(imc >=30.0) {
        System.out.print("Obesidade");
    }
    
    
    
    
    
    
    
    
    
        }
    
}


