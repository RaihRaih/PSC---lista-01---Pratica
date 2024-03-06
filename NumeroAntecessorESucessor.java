/*Raissa Rodrigues - Sistemas de Informação
 12. Escreva um algoritmo para ler um valor e escrever o seu antecessor e o seu sucessor. */

import java.util.Scanner;

public class NumeroAntecessorESucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAntecessor, numeroSucessor, numero;

        System.out.println("Digite um numero inteiro: ");
        numero = scanner.nextInt();

        numeroAntecessor = numero - 1;
        numeroSucessor = numero + 1;

        System.out.println(
                "O antecessor de " + numero + " eh: " + numeroAntecessor + "\nO sucessor de " + numero + " eh: " +
                        numeroSucessor);

    }
}
