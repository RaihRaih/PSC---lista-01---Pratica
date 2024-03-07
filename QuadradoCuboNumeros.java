/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*Raissa Rodrigues - Sistemas de Informação
 * 19 .Escreva um programa que calcule os quadrados e cubos dos números 
 de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:
 */


public class QuadradoCuboNumeros {
    public static void main(String[] args) {
        
        int i, quadrado, cubo;
        System.out.println("Número\tQuadrado\tCubo");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        
        for (i = 0; i < 11; i++ ){
            quadrado= i*i;
            cubo= i*i*i;
            
            System.out.printf("%d\t%d\t\t%d\n", i, quadrado, cubo);
        } 
        
    }
}

