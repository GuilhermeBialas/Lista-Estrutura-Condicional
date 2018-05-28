import javax.swing.JOptionPane;
public class Exercicio3Lista2{
    public static void main(String[] args){
      
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

       int opc = Integer.parseInt(JOptionPane.showInputDialog( "        Menu" 
                                    +"\n1             somar        "
                                    +"\n2             subtrair     "    
                                    +"\n3             multiplicar  "
                                    +"\n4             dividir      "));
                 
          
            if(opc == 1){
                double soma = numero1 + numero2;
                JOptionPane.showMessageDialog(null," A soma entre o número "+ numero1 + " e o número "+ numero2+ " é :"+ soma );
            }else if(opc == 2){
                double subtracao = numero1 - numero2;
                JOptionPane.showMessageDialog(null," A subtração entre o número "+ numero1 + " e o número "+ numero2+ " é :"+ subtracao );
            }else if(opc == 3){
                double mult = numero1 * numero2;
                JOptionPane.showMessageDialog(null," A multiplicação entre o número "+ numero1 + " e o número "+ numero2+ " é :"+ mult );
            }else{
                double divisao = numero1 / numero2;
                JOptionPane.showMessageDialog(null," A divisão entre o número "+ numero1 + " e o número "+ numero2+ " é :"+ divisao );
            }
        
       }
}