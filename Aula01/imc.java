package Aula01;

import java.util.Scanner;

class input{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float peso1;
        Float altura1;
        String nome1;

        System.out.println("Insira seu nome: ");
        nome1 = scanner.nextLine();

        System.out.println("Insira seu peso: ");
        peso1 = scanner.nextFloat();

        System.out.println("Insira sua altura: ");
        altura1 = scanner.nextFloat();

        Float alturam = altura1/100.0f;
        Float imc = (peso1) % (alturam * alturam);

        if (imc < 16.9) { 
            System.out.println(nome1 + " tem " + alturam + " de altura e pesa " + peso1 + "kg. Sua situação é MUITO ABAIXO DO PESO.");
        } else if (17 <= imc && imc <= 18.4) {
            System.out.println(nome1 + " tem " + alturam + " de altura e pesa " + peso1 + "kg. Sua situação é Abaixo do peso");
        } else if (18.5 <= imc && imc <= 24.9) {
            System.out.println(nome1 + " tem " + alturam + " de altura e pesa " + peso1 + "kg. Sua situação é PESO NORMAL");
        } else if (25 <= imc && imc <= 29.9) {
            System.out.println(nome1 + " tem " + alturam + " de altura e pesa " + peso1 + "kg. Sua situação é ACIMA DO PESO");
        } else if (30 <= imc && imc <= 34.9) {
            System.out.println(nome1 + " tem " + alturam + " de altura e pesa " + peso1 + "kg. Sua situação é OBESIDADE GRAU I");
        } else if (35 <= imc && imc <= 40) {
            System.out.println(nome1 + " tem " + alturam + " de altura e pesa " + peso1 + "kg. Sua situação é OBESIDADE GRAU II");
        } else if (imc < 40) {
            System.out.println(nome1 + " tem " + alturam + " de altura e pesa " + peso1 + "kg. Sua situação é OBESIDADE GRAU III");
        }
   }
}
