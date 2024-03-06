/*Raissa Rodrigues - Sistemas de Informação
 8. Escreva um programa que converte uma quantidade de metros para centímetros.
*/

import java.util.Scanner;

public class ConversorMetrosCm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float metros, centimetros; // 1m = 100cm

        System.out.println("Digite o Valor em metros e veja a conversao em centimetros:\nValor: ");
        metros = scanner.nextFloat();

        centimetros = metros * 100;
        System.out.println("Valor em centimetros: " + centimetros + "cm");
        scanner.close();
    }

}
