
/*Raissa Rodrigues - Sistemas de Informação

6. Crie um algoritmo que leia a idade de uma pessoa e calcule quantos dias essa pessoa já viveu.
*/
import java.util.Scanner;

public class LerIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int idade, dias;
		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt();
		dias = idade * 365;

		System.out.println("Você já viveu de " + dias + " dias! (Considerando que o ano tem 365 dias!)");

		scanner.close();

	}
}
