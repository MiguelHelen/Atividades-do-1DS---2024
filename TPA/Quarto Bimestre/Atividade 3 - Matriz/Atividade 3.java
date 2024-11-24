/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade3;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição (" + (i + 1) + ", " + (j + 1) + "): ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

    
        System.out.println("Valores da diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Elemento na posição (" + (i + 1) + ", " + (i + 1) + "): " + matriz[i][i]);
        }

        
        System.out.println("Valores da diagonal secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Elemento na posição (" + (i + 1) + ", " + (4 - i) + "): " + matriz[i][3 - i]);
        }
  
    }
    
}
