import javax.swing.*;
public class ex02 {

    public static void main (String[]args) {
        int fibo = 1;
        int n = 0; 

        String output = n + " " + fibo;
        JOptionPane.showMessageDialog(null, output);
        for(int i = 0; i < 8; i++) {
            fibo = fibo + n;
            n = fibo - n;
            JOptionPane.showMessageDialog(null, fibo);
        }


    }
}