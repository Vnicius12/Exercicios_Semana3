import javax.swing.JOptionPane;

public class ElevarNumeroAoQuadrado{

   public static void main (String [] arsgs){
   
      int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inteiro: "));
      
      double quadrado = Math.pow(base,2);
      
      JOptionPane.showMessageDialog(null, "O numero ao quadrado é: " + quadrado); 
   }
}