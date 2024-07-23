package analise_formacao_vaga;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.print ( "Nome do candidato: " );
    String nome = sc.nextLine();
    System.out.print ( "Grau de escolaridade: " );
    String grau = sc.nextLine();
    System.out.print( "Formação: ");
    String formacao = sc.nextLine();
    System.out.print( "Pretensão salarial: ");
    double pretensao = sc.nextDouble();
    
   
    
    if (formacao.equalsIgnoreCase("Análise de sistemas") && grau.equalsIgnoreCase("superior completo") && pretensao <= 6000) {
        System.out.println();
    	System.out.println( "Incrição recebida " );
    }
    else if ( pretensao > 6000)  {
    	System.out.println( "A faixa salarial da vaga está entre 5000 e 6000. Aceita continuar o processo? "   );
    	String aceitar = sc.next();
    	if (aceitar.equalsIgnoreCase("sim") || aceitar.equalsIgnoreCase("s") ) { 
    		System.out.println( );
    		System.out.println( "Inscrição recebida " );
    	} else {
    		System.out.println();
    		System.out.println( "Agradecemos a disponibilidade - inscrição interrompida " );
    }
    
    }
   
    else {
    	System.out.println();
    	System.out.println( "Não preenche os pré-requisitos para a vaga" );
    }
    }
	}


