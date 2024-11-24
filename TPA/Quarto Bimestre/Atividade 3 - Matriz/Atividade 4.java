/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade4;

import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class Main {
    
    public static void main(String[] args){
        
  final int N_Lin = 3, N_Col = 3;
  int[][] mat = new int[N_Lin] [N_Col]; 
  int l,c;

   JOptionPane.showMessageDialog (null,"*** Cadastrando dados na matriz *****\n  Entre om o valor en cada posição da matriz" );


for (l = 0;l< N_Lin; l++)
{
  for (c = 0;c< N_Col; c++)
  {
mat [1][c]=Integer.parseInt(JOptionPane.showInputDialog("Valor linha "+(l+1)+" coluna "+(c + 1)+" "));

  }
}


JOptionPane.showMessageDialog(null, " **** Exibindo os dados da matriz ****");


for (l= 0;  l<N_Lin; l++)
    
{
for (c = 0;  c <N_Col; c++)
    
{

System.out.print(mat [1] [c]+" ");

}

System.out.print("\n"); 

}
    }
    
}
