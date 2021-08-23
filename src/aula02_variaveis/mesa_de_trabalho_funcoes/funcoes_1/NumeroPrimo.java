package aula02_variaveis.mesa_de_trabalho_funcoes.funcoes_1;

import java.util.Scanner;

// Exercício 1
// Faça uma função que, dado um número, indica se é um número primo ou não.
// Um número primo é aquele que só pode ser dividido por 1 e ele mesmo.
// Por exemplo: 25 não é primo, pois 25 é divisível por 1, 5 e 25.
// 17 é primo porque só pode ser dividido por 1 e por 17.
// Para usar esta função que iremos criar em um programa,
// podemos permitir a entrada de apenas um número para verificar se o número é primo ou não.
// Para resolvê-lo, use a função obtida no exercício desenvolvido na aula assíncrona, Boolean e Divisível (int n, int divisor).
public class NumeroPrimo {

    public static void main(String[] args) {
        // numero primo: divisivel por 1 e por ele mesmo.
        // numero de divisores = 2.

        int numEntrada;
        int numDivisores = 0;


        Scanner entrada;
        entrada = new Scanner(System.in);

        System.out.println("Digite um número para saber se é primo ou não:");
        numEntrada = entrada.nextInt();

        // verifico quantos divisores são divisiveis pelo numero de entrada
        for(int i = 1; i <= numEntrada; i++) {
            if(numEntrada % i == 0) {
                numDivisores++; // guardo os divisores que são resto = 0
                //System.out.println("numeros que são divisíveis por " + numEntrada + ": " + i);
            }
        }

        // faço uma condição para saber se o numero de divisores é = 2
        if(numDivisores == 2) {
            System.out.println("Verificamos que o numero " + numEntrada + " é Primo!");
        } else {
            System.out.println("Verificamos que o numero " + numEntrada + " não é primo." );
        }
    }
}
