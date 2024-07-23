import javax.swing.JOptionPane;


public class Exercicio1 {
   public static void main (String[] args){
       
       int a=0, b=0, c=0, d=0, r=0;
       
       a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número"));
       b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número"));
       c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° número"));
       d = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4° número"));
       r = (a * b) + (a * c) + (a * d);
       JOptionPane.showMessageDialog(null, "O resultado é: " + r);
   }
           }