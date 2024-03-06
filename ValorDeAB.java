
/*Raissa Rodrigues - Sistemas de Informação 
 *Desenvolva um programa que, dados dois valores A e B, troque os valores de forma que A passe a ter o valor 
 de B e vice-versa. Exiba os valores após a troca.
*/
import java.util.Scanner;

public class ValorDeAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float A, B, C;

        System.out.println("Digite o Valor de A: ");
        A = scanner.nextFloat();
        System.out.println("Digite o Valor de B: ");
        B = scanner.nextFloat();

        System.out.println("Valor inicial de A = " + A + "\nValor inicial de B = " + B);
        System.out.println("\n\n Agora, A vai passar a ter o valor de B e vice-versa");

        C = A;
        A = B;
        B = C;
        System.out.println("Novo valor de A = " + A + "\nNovo valor de B = " + B);
        scanner.close();

    }
}
