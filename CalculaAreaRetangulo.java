import javax.swing.JOptionPane;

public class CalculaAreaRetangulo{

   public static void main(String [] args){
   
   int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do retangulo: "));
   int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do retangulo: "));
   
   int n = (base * altura);
   
   JOptionPane.showMessageDialog(null, "A área do retangulo é: " + n);
   }
}