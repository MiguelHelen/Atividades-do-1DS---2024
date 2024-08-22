/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project8;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Informe a medida do lado A em centímetros:");
        double a = sc.nextDouble();
        
        System.out.print("Informe a medida do lado B em centímetros:");
        double b = sc.nextDouble();
    
        System.out.print("Informe a medida do lado C em centímetros:");
        double c = sc.nextDouble();
        
        double soma1 = a + b;
        double soma2 = b + c;
        double soma3 = c + a;
        
        if(a == b && a == c && b == c && soma1 > c && soma2 > a && soma3 > b){
        System.out.print("Triângulo Equilátero");
        }
        else if(a == b && a != c && b != c && soma1 > c && soma2 > a && soma3 > b){
        System.out.print("Triângulo Isosceles");
        }
        else if(a != b && a != c && b != c && soma1 > c && soma2 > a && soma3 > b){
        System.out.print("Triângulo Escaleno");
        }
        else {
        System.out.print("Não compõem um triângulo");
        }
    }
    
}
