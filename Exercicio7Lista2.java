import javax.swing.JOptionPane;
public class Exercicio7Lista2{
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        if(numero == 0){
           JOptionPane.showMessageDialog(null, "O número: "+ numero+" é neutro");
        }else if(numero % 2 == 0){
          JOptionPane.showMessageDialog(null, "O número: "+numero+" é par");
        }else if(numero % 2 != 0){
            JOptionPane.showMessageDialog(null, "O número: "+numero+" é ímpar");
        }
       
        if(numero > 0){
            JOptionPane.showMessageDialog(null,"O número: "+numero+" é positivo");
        }else if(numero ==0){
            JOptionPane.showMessageDialog(null, "O número: "+numero+" é neutro");
        }else {
            JOptionPane.showMessageDialog(null, "O número: "+numero+" é negativo");
        }
       
        if(numero > 10){
            JOptionPane.showMessageDialog(null, "O número: "+numero+" é maior que 10");
        }else if(numero <= 10){
            JOptionPane.showMessageDialog(null,"O número: "+numero+" é menor que 10");
        }

        if(numero < 50){
            JOptionPane.showMessageDialog(null, "O numero: "+numero+" é menor que 50 ");
        }else if(numero == 50){
            JOptionPane.showMessageDialog(null,"O número: "+numero+" é igual a 50");
        }else {
            JOptionPane.showMessageDialog(null,"O número: "+numero+" é maior que 50");
        }
     
        if(numero < -10){
            JOptionPane.showMessageDialog(null,"O número: "+numero+" é menor que -10");
        }else if(numero >= -10){
            JOptionPane.showMessageDialog(null,"O número:"+numero+" não é menor que -10");
        }
  
        if(numero > 30){
            JOptionPane.showMessageDialog(null,"O número: "+numero+" é maior do que 30");
        }else if(numero == 30){
            JOptionPane.showMessageDialog(null,"O número: "+numero+" é igual a 30");
        }else{
            JOptionPane.showMessageDialog(null,"O número: "+numero+" é menor que 30");
        }
  
        if(numero != 1){
            JOptionPane.showMessageDialog(null,"O número: "+numero+" é diferente que 1");
        }else{
            JOptionPane.showMessageDialog(null,"O número: "+numero+" é igual a 1");
        }





    }
}