/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade2;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Main {
    
     public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        boolean temRepetidos = false;

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posição (" + (i + 1) + ", " + (j + 1) + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = i; k < 3; k++) {
                    for (int l = (k == i) ? j + 1 : 0; l < 5; l++) {
                        if (matriz[i][j] == matriz[k][l]) {
                            temRepetidos = true;
                            break;
                        }
                    }
                    if (temRepetidos) break;
                }
                if (temRepetidos) break;
            }
            if (temRepetidos) break;
        }

        if (temRepetidos) {
            System.out.println("A matriz possui elementos repetidos.");
        } else {
            System.out.println("A matriz não possui elementos repetidos.");
        }

        
        int countPares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 0) {
                    countPares++;
                }
            }
        }
        System.out.println("Quantidade de números pares: " + countPares);

        
        int countImpares = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    countImpares++;
                }
            }
        }
        System.out.println("Quantidade de números ímpares: " + countImpares);
       
     
     
     }
    
}

