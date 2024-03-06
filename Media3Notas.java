/*Raissa Rodrigues - Sistemas de Informação 
11. Crie um programa que calcula a média simples de três notas fornecidas pelo usuário.*/

import java.util.Scanner;

public class Media3Notas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.println("Digite o valor de tres notas e veja a media: \nNota 1: ");
        nota1 = scanner.nextFloat();
        System.out.println("Nota 2: ");
        nota2 = scanner.nextFloat();
        System.out.println("Nota 3: ");
        nota3 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Media das 3 notas: %.2f", media);
    }

}
