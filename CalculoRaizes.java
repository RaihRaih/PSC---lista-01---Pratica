/*Raissa Rodrigues - Sistemas de Informação 
 *15. Construa um programa que calcule as raízes de uma equação de 2º grau (Ax2+Bx+C). 
 Sendo que os valores A,B e C são fornecidos pelo usuário. Considere que tem duas raízes.
*/

import java.util.Scanner;

public class CalculoRaizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A, B, C, raiz1, raiz2, delta;

        System.out.println("Digite o Valor de A: ");
        A = scanner.nextFloat();
        System.out.println("Digite o Valor de B: ");
        B = scanner.nextFloat();
        System.out.println("Digite o Valor de C: ");
        C = scanner.nextFloat();

        // calculo de delta
        delta = B * B - 4 * A * C;

        // Verifique se delta é negativo
        if (delta < 0) {
            System.out.println("A equação não tem raízes reais.");
        } else {
            // Cálculo das raízes apenas se delta não for negativo
            raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
            raiz2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.println("As raízes são:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }

        scanner.close();
    }
}
