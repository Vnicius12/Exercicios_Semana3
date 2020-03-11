import javax.swing.JOptionPane;

public class CalculaDias{

   public static void main(String [] args){
   
   int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
   
   int resultado = idade * 365;
   
   JOptionPane.showMessageDialog(null, "Dias aproximados: " + resultado);
   
   } 
}