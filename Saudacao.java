
/*Raissa Rodrigues - Sistemas de informação
3 - Crie um algoritmo que leia o primeiro nome do usuário e escreva uma saudação para ele. */

import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome: ");

        nome = input.nextLine();
        System.out.println("Ola " + nome + ", Como vai!!");

        input.close();

    }

}