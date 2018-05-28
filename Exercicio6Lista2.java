import javax.swing.JOptionPane;
public class Exercicio6Lista2{
    public static void main(String[] args){
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

    if(numero != 1){
        JOptionPane.showMessageDialog(null, " o número "+ numero + " é diferente que 1");
    }else {
          JOptionPane.showMessageDialog(null, "O número "+ numero + " é igual a 1");
    }
    }
}