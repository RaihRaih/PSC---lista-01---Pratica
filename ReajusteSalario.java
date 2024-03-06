/*Raissa Rodrigues - Sistemas de Informação
7. Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado*/

import java.util.Scanner;

public class ReajusteSalario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float salario, reajuste, salarioFinal;

        System.out.println("Digite o valor o seu salario:");

        salario = scanner.nextFloat();
        reajuste = salario * 0.07f;
        salarioFinal = reajuste + salario;

        System.out.println("Reajuste de: R$" + reajuste + "\nSalario final: R$" + salarioFinal);

    }
}