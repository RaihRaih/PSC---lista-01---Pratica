/*Raissa Rodrigues - Sistemas de Informação
 * 17 . Faça um programa para o seguinte problema: Compraram-se N canetas iguais, 
 * que foram pagas com uma nota de Z reais, obtendo-se Y reais como troco. Quanto custou cada caneta? */

import java.util.Scanner;

public class ValorCaneta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de canetas compradas (N): ");
        int numeroCanetas = scanner.nextInt();

        System.out.print("Digite o valor total pago (Z): ");
        double valorPago = scanner.nextDouble();

        System.out.print("Digite o valor do troco recebido (Y): ");
        double troco = scanner.nextDouble();

        // Calcula o valor total pago pelas canetas
        double valorTotal = valorPago - troco;

        // Calcula o custo de cada caneta
        double precoPorCaneta = valorTotal / numeroCanetas;

        System.out.printf("O custo de cada caneta é: %.2f", precoPorCaneta, " reais.");

        scanner.close();
    }
}
