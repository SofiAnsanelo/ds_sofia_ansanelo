import javax.swing.*;
public class ex01 {
    public static void main (String[]args) {
        String nome = JOptionPane.showInputDialog("Qual é seu nome?");
        String altura = JOptionPane.showInputDialog("Qual é sua altura?");
        String peso = JOptionPane.showInputDialog("Qual é seu peso?");

        Float alt = Float.parseFloat(altura);
        Float pes = Float.parseFloat(peso);

        Float imc = pes / (alt * alt);

        if (imc < 16.9) { 
            String output = nome + " tem " + alt + " de altura e pesa " + pes + "kg. Sua situação é MUITO ABAIXO DO PESO.";
            JOptionPane.showMessageDialog(null, output);
        } else if (imc < 18.4) {
            String output = nome + " tem " + alt + " de altura e pesa " + pes + "kg. Sua situação é Abaixo do peso";
            JOptionPane.showMessageDialog(null, output);
        } else if (imc < 25) {
            String output = nome + " tem " + alt + " de altura e pesa " + pes + "kg. Sua situação é PESO NORMAL";
            JOptionPane.showMessageDialog(null, output);
        } else if  (imc < 30) {
            String output = nome + " tem " + alt + " de altura e pesa " + pes + "kg. Sua situação é ACIMA DO PESO";
            JOptionPane.showMessageDialog(null, output);
        } else if (imc < 35) {
            String output = nome + " tem " + alt + " de altura e pesa " + pes + "kg. Sua situação é OBESIDADE GRAU I";
            JOptionPane.showMessageDialog(null, output);
        } else if (imc < 40) {
            String output = nome + " tem " + alt + " de altura e pesa " + pes + "kg. Sua situação é OBESIDADE GRAU II";
            JOptionPane.showMessageDialog(null, output);
        } else {
            String output = nome + " tem " + alt + " de altura e pesa " + pes + "kg. Sua situação é OBESIDADE GRAU III";
            JOptionPane.showMessageDialog(null, output);
        }
    }
}