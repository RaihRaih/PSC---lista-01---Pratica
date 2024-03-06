/*Raissa Rodrigues - Sistemas de Informação
 10. Faça um programa que converta a temperatura dada em Fahrenheit para Celsius.  Para testar se a sua resposta está correta saiba que 100ºC = 212F. Considere C/5 = (F-32)/9
*/

import java.util.Scanner;

public class ConversorFahreinheitCelsius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float celsius, fahreinheit, conversao;

        System.out.print(
                "Digite um valor de temperatura em Fahrenheit e converta para Celsius:\n");

        System.out.println("Fahrenheit:");
        fahreinheit = scanner.nextFloat();

        celsius = (fahreinheit - 32) * 5 / 9; // Fórmula de conversão de Fahrenheit para Celsius

        System.out.printf("Celsius: %.2f\n", celsius);

        scanner.close();

    }
}
