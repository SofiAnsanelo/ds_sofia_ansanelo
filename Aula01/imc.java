package Aula01;
import java.util.Scanner;
public class imc{
public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Float peso1;
        Float altura1;
        String nome1;

        System.out.println("Insira seu nome: ");
        nome1 = Scanner.nextLine();

        System.out.println("Insira seu peso: ");
        peso1 = Scanner.nextFloat();

        System.out.println("Insira sua altura: ");
        altura1 = Scanner.nextFloat();

        Float imc = peso1 / (altura1 * altura1);

        if (imc < 16.9) { 
            System.out.println(nome1 + " tem " + altura1 + " de altura e pesa " + peso1 + "kg. Sua situação é MUITO ABAIXO DO PESO.");
        } else if (imc < 18.4) {
            System.out.println(nome1 + " tem " + altura1 + " de altura e pesa " + peso1 + "kg. Sua situação é Abaixo do peso");
        } else if (imc < 25) {
            System.out.println(nome1 + " tem " + altura1 + " de altura e pesa " + peso1 + "kg. Sua situação é PESO NORMAL");
        } else if  (imc < 30) {
            System.out.println(nome1 + " tem " + altura1 + " de altura e pesa " + peso1 + "kg. Sua situação é ACIMA DO PESO");
        } else if (imc < 35) {
            System.out.println(nome1 + " tem " + altura1 + " de altura e pesa " + peso1 + "kg. Sua situação é OBESIDADE GRAU I");
        } else if (imc < 40) {
            System.out.println(nome1 + " tem " + altura1 + " de altura e pesa " + peso1 + "kg. Sua situação é OBESIDADE GRAU II");
        } else {
            System.out.println(nome1 + " tem " + altura1 + " de altura e pesa " + peso1 + "kg. Sua situação é OBESIDADE GRAU III");
        }
    }
}
