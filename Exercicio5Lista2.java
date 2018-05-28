import javax .swing.JOptionPane;
public class Exercicio5Lista2{
    public static void main(String[] args){
        
          double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
           if((numero % 2)!=0){
                JOptionPane.showMessageDialog(null , " o número "+ numero + " é ímapar");
           }else{
                JOptionPane.showMessageDialog(null , " o número "+ numero + " não é ímpar");
           }
    }
}