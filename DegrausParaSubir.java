/*Raissa Rodrigues - Sistemas de Informação
 * 18 . Cada degrau de uma escada tem X de altura. Faça um programa que receba essa altura e a altura que o
 *  usuário deseja alcançar subindo a escada, calcule e mostre quantos degraus ele deverá subir para atingir seu 
 * objetivo, sem se preocupar com a altura do usuário. Todas as medidas fornecidas devem estar em metros */

import java.util.Scanner;

public class DegrausParaSubir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float alturaDegrau, alturaAoSubir, quantidadeDegraus;

        System.out.print("Digite a altura dos degraus, em metros (X): ");
        alturaDegrau = scanner.nextFloat();

        System.out.print("Altura que voce deseja acalncar, em metros: ");
        alturaAoSubir = scanner.nextFloat();

        // Calcula quantos degraus ele deverá subir para atingir seu objetivo
        quantidadeDegraus = alturaAoSubir / alturaDegrau;

        System.out.println("Quantidade de degraus a serem subidos: " + quantidadeDegraus);

        scanner.close();
    }
}
