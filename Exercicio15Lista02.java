import javax.swing.JOptionPane;
public class Exercicio15Lista02{
    public static void main(String[] args) {
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

        if (n1 < n2 && n2 < n3 && n3 > n1){
            JOptionPane.showMessageDialog(null, "Os número em ordem decrescente são : "+ n3 +" "+n2+" "+n1);
        }else if (n1 < n2 && n2 > n3 && n3 > n1){
            JOptionPane.showMessageDialog(null, "Os número em ordem decrescente são : "+ n2 +" "+n3+" "+n1);
        }else if (n1 < n2 && n2 > n3 && n3 < n1){
            JOptionPane.showMessageDialog(null, "Os número em ordem decrescente são : "+ n2 +" "+n1+" "+n3);
        }else if (n1 > n2 && n2 < n3 && n3 > n1){
            JOptionPane.showMessageDialog(null, "Os número em ordem decrescente são : "+ n3 +" "+n1+" "+n2);
        }else if (n1 > n2 && n2 > n3 && n3 < n1){
            JOptionPane.showMessageDialog(null, "Os número em ordem decrescente são : "+ n1 +" "+n2+" "+n3);
        }else if (n1 > n2 && n2 < n3 && n3 < n1){
            JOptionPane.showMessageDialog(null,"Os número em ordem decrescente são : "+ n1 +" "+n3+" "+n2);

        }
    }
}