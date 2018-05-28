import javax.swing.JOptionPane;
public class Exercicio1Lista2{
    public static void main(String[] args){
    
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        if(numero >= 1){
            JOptionPane.showMessageDialog(null, "O número "+ numero + " é positivo");
        }else{
            JOptionPane.showMessageDialog(null, "O número "+numero+" não é positivo" );
        }
  
  
  
  
  
    }
}