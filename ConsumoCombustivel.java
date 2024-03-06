/*Raissa Rodrigues - Sistemas de Informação
 * 16. Faça um programa que receba de entrada a distância total (em km) percorrida por um automóvel 
 * e a quantidade de combustível (em litros) consumida para percorrê-la, calcule e imprima o consumo 
 * médio de combustível. Fórmula: distância/litro. */

import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double distanciaTotal, quantidadeCombustivel, consumoMedio;

        System.out.println(
                "Digite o Valor da distancia Total - Em KM (utilize a virgula para separar as casa decimais): ");
        distanciaTotal = scanner.nextDouble();
        System.out.println(
                "Digite o Valor da quantidade Combustivel - Em Litros (utilize a virgula para separar as casa decimais): ");
        quantidadeCombustivel = scanner.nextDouble();

        consumoMedio = distanciaTotal / quantidadeCombustivel;

        System.out.printf("Consumo Médio de combustível: %.2f km/l", consumoMedio);
        scanner.close();
    }
}
