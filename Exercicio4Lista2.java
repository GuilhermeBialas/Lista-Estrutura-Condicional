import javax.swing.JOptionPane;
public class Exercicio4Lista2{
    public static void main(String[] args){
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        if((numero % 2) == 0){
            JOptionPane.showMessageDialog(null , " o número "+ numero + " é par");
        }else{
            JOptionPane.showMessageDialog(null , " o número "+ numero + " não é par");
        }
    } 
}