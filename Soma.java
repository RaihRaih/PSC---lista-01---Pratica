/*Raissa Rodrigues - Sistemas de informação
1 - Crie um programa que solicita ao usuário dois números e, em seguida, mostra a soma desses números.

*/
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        
        System.out.print("Digite dois numeros para somar:");

        float num1,num2, soma;
        Scanner scanner = new Scanner(System.in);
        
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();

        soma = num1 + num2;
        System.out.println("Soma: "+ soma);
    
        scanner.close();
    }
}
