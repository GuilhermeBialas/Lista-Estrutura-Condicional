import javax.swing.JOptionPane;

public class Exercicio10Lista02{
    public static void main(String[] args){

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número correspondente a lateral"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número correspondente a lateral"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número correspondente ao comprimento"));
        int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número correspondente ao comprimento"));

if(n1 == n2 && n3 == n4){
    JOptionPane.showMessageDialog(null, "É um reângulo");
}else {
    JOptionPane.showMessageDialog(null, "Não é um reângulo");
}

    }
}