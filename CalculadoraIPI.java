/*Raissa Rodrigues - Sistemas de Informação
 * 20 .Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor das peças
 - o código da peça 1, valor unitário da peça 1, quantidade de peças 1 - o código da peça 2, 
 valor unitário da peça 2, quantidade de peças 2. O algoritmo deve calcular o valor total a ser 
 pago e apresentar o resultado.*/

import java.util.Scanner;

public class CalculadoraIPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double ipiPorcentagem, valorUnitarioPeca1, valorUnitarioPeca2, totalSemIPI, ipi, totalComIPI;
        int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
        
        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
        ipiPorcentagem = scanner.nextDouble();

        System.out.println("Informe os dados da peça 1:");
        codigoPeca1 = scanner.nextInt();
        valorUnitarioPeca1 = scanner.nextDouble();
        quantidadePeca1 = scanner.nextInt();

        System.out.println("Informe os dados da peça 2:");
        codigoPeca2 = scanner.nextInt();
        valorUnitarioPeca2 = scanner.nextDouble();
        quantidadePeca2 = scanner.nextInt();

        // Calcula o valor total das peças sem o IPI
        totalSemIPI = (valorUnitarioPeca1 * quantidadePeca1) + (valorUnitarioPeca2 * quantidadePeca2);

        // Calcula o valor total do IPI
        ipi = totalSemIPI * (ipiPorcentagem / 100);

        // Calcula o valor total a ser pago (com o IPI)
        totalComIPI = totalSemIPI + ipi;

        System.out.println("Valor total a ser pago (com IPI): " + totalComIPI + " reais.");

        scanner.close();
    }
}
