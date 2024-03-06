/*Raissa Rodrigues - Sistemas de Informação
 13. Escreva um programa que calcula o salário líquido de um funcionário. O programa deve solicitar 
 o valor da hora de trabalho, o número de horas trabalhadas no mês e o percentual de desconto do INSS.
 */

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorHora, horasTrabalhadas, percentualINSS, salarioBruto, descontoINSS, salarioLiquido;
        System.out.print("Digite o valor da hora de trabalho: ");
        valorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto do INSS: ");
        percentualINSS = scanner.nextDouble();

        salarioBruto = valorHora * horasTrabalhadas;
        descontoINSS = salarioBruto * (percentualINSS / 100);
        salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("Salário líquido: R$" + salarioLiquido);

        scanner.close();
    }
}
