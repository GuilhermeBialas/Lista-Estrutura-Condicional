import javax.swing.JOptionPane;

public class Exercicio12Lista02{
    public static void main(String[] args){
        
     double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
     double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
     
     if(n1 < n2){
         JOptionPane.showMessageDialog(null, n2 + " é maior que "+n1);
     }else if(n2 < n1){
        JOptionPane.showMessageDialog(null, n1 + " é maior que "+n2);
     }else{
         JOptionPane.showMessageDialog(null, n1 +" e "+ n2 +" são iguais");
     }
    
    }
}