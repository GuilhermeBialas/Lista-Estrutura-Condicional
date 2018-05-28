import javax.swing.JOptionPane;
public class Exercicio2Lista2{
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        if(numero <= -1){
            JOptionPane.showMessageDialog(null, "O número "+ numero + " é negativo");
        }else{
            JOptionPane.showMessageDialog(null, "O número "+numero+" não é negativo" );
        }
  
    }
}