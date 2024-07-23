package com.mycompany.auladeswing;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exercicio2 {
    
    
    public static int calcularDobro(int numero){
    return numero* 2;
    }
    
    public static void main(String[] args) {
        int numero = 5;
        var resultado = calcularDobro(numero);
        System.out.println("O dobro de " + numero + " é: " +resultado);
    }
}