import javax.swing.JOptionPane;

public class SomarString{

   public static void main(String [] args){
      
      String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra: ");
      String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra: ");
      String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra: ");
     
      String resultado1 = palavra1 + palavra2 + palavra3;
      int resultado = resultado1.length();
      
      JOptionPane.showMessageDialog(null, "A quantidade é: "+ resultado);
   }
}