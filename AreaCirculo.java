
/*Raissa Rodrigues - Sistemas de Informação 
 *9. Desenvolva um programa que calcula a área de um círculo, onde o raio é fornecido pelo usuário.*/
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

        // Área do Círculo = pi * raio^2

        Scanner scanner = new Scanner(System.in);
        float raio, pi = 3.14f;
        double areaCirculo;

        System.out.println("Vamos calcular a Area de um circulo.\nDigite o valor do raio: ");
        raio = scanner.nextFloat();

        areaCirculo = pi * (Math.pow(raio, 2)); // Utilizando Math.pow para elevar o raio ao quadrado

        System.out.printf("A area do circulo é: %.2f\n", areaCirculo); // Usando printf para formatar a saída

        scanner.close();

    }
}
