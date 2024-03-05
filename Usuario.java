/*Raissa Rodrigues - Sistemas de informação 
 * 4 - Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e depois mostre os dados digitados.
 * 
*/

import java.util.Scanner;

public interface Usuario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, endereco, telefone;

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();

        System.out.println("Digite seu endereco: ");
        endereco = input.nextLine();

        System.out.println("Digite seu telefone: ");
        telefone = input.nextLine();

        System.out.println("Seus dados: " + "Nome:"+ nome+ ";\tEndereco:"+ endereco+ ";\tTelefone:"+ telefone+";");

        input.close();

    }

}
