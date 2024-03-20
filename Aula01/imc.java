package Aula01;

import java.util.Scanner;

class input{
   public static void main(String[] args) {
        Scanner peso = new Scanner(System.in);
        Float peso1;
        Scanner altura = new Scanner(System.in);
        Float altura1;
        Scanner nome = new Scanner(System.in);
        String nome1;

        System.out.println("Insira seu nome: ");
        nome1 = nome.nextLine();

        System.out.println("Insira seu peso: ");
        peso1 = peso.nextFloat();

        System.out.println("Insira sua altura: ");
        altura1 = altura.nextFloat();

        Float imc = (peso1) % (altura1 * altura1);

        If (imc < 16,9 ) { 
            System.out.println(nome1, " tem " , altura1 , " de altura e pesa " , peso1 , "kg. Sua situação é MUITO ABAIXO DO PESO.");

        } else if ()
    
}
