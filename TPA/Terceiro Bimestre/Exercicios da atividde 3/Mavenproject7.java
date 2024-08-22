/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project7;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o Dia1: ");
        int dia1 = sc.nextInt();
        System.out.print("Digite o Mês1: ");
        int mes1 = sc.nextInt();
        System.out.print("Digite o Ano1: ");
        int ano1 = sc.nextInt();

        
        System.out.print("Digite o Dia2: ");
        int dia2 = sc.nextInt();
        System.out.print("Digite o Mês2: ");
        int mes2 = sc.nextInt();
        System.out.print("Digite o Ano2: ");
        int ano2 = sc.nextInt();

        if(ano1 > ano2 ) { 
        	System.out.println("Datas: " + dia2 +   "/" + mes2  +  "/" + ano2 + " " + "e" + " "  + dia1 +  "/" + mes1  +  "/"  + ano1);
        	
        }
        else if(ano1 == ano2 && mes1 > mes2) {
        	System.out.println("Datas: " + dia2 +   "/" + mes2    + "/" + ano2 + " " + "e" + " "  + dia1 + "/" + mes1  +  "/"  + ano1);
        }
        else if(ano1 == ano2 && mes2 > mes1) {
	    	System.out.println("Datas: " + dia1    + "/"  + mes1  + "/" + ano1+ " " +"e" + " "  + dia2   + "/" + mes2   + "/" + ano2);
	    }
        
        else if(ano1 == ano2 && mes1 == mes2 && dia1 > dia2 ){
                System.out.println("Datas: " + dia2 +   "/" + mes2    + "/" + ano2 + " " + "e" + " "  + dia1 + "/" + mes1  +  "/"  + ano1);
        }
        else if(ano1== ano2 && mes1 == mes2 && dia2 > dia1){
            System.out.println("Datas: " + dia1 +   "/" + mes1    + "/" + ano1 + " " + "e" + " "  + dia2 + "/" + mes2  +  "/"  + ano2);
        }
        
	else {
	    	System.out.println("Datas: " + dia1   +  "/"  + mes1 +  "/" + ano1+ " " +"e" + " "  + dia2  + "/" + mes2  + "/" + ano2);
	    
	    }  
    }
    
}
