/*Raissa Rodrigues - Sistemas de Informação
 * 5 - Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a cotação é US$ 1 = R$ 4,95.
 */

import java.util.Scanner;

public class ConversaoDolarReal {
    public static void main(String[] args) {

        System.out.print(
                "Digite um valor em dolar e veja a sua conversão em real (Dolar Norte Americano -> Real Brasileiro):\n");

        double real, dolar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dolar:");
        dolar = scanner.nextFloat();
        real = dolar * 4.95;

        System.out.println("Conversão em Reais: " + real);

        scanner.close();
    }
}
