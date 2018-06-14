import javax.swing.JOptionPane;
public class Exercicio9Lista2{
    public static void main(String[] args){

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
if(n1 == n2 && n3 ==n4){
    JOptionPane.showMessageDialog(null, "É um quadrado");
}else{
    JOptionPane.showMessageDialog(null, "Não é um quadrado");
}

    }
}