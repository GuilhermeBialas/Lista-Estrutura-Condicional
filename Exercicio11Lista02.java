import javax.swing.JOptionPane;

public class Exercicio11Lista02{
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null, "Digite suas notas para saber se foi aprovado");
       double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));
       double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));
       double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));
       double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));
       double n5 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));

       double media = (n1+n2+n3+n4+n5)/5;

     if(media<5.99){
         JOptionPane.showMessageDialog(null, "Você está Reprovado"+"\nSua média é: "+ media);
     }else if(media<7.99){
        JOptionPane.showMessageDialog(null, "Você está em recuperação"+"\nSua média é: "+ media);
     }else {
        JOptionPane.showMessageDialog(null, "Você está Aprovado"+"\nSua média é: "+ media);
     }
   
    }

}