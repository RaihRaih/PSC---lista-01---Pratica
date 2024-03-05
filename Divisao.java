
/*Raissa Rodrigues - Sistemas de informação
2 - Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles. */

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        
        System.out.print("Digite dois numeros e veja o resto de sua divisão:");
        

        int num1,num2,divisao;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        divisao = num1%num2;

        System.out.println("resto da divisao: "+ divisao);
    
        scanner.close();
    
    }
}