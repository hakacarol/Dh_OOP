package aula02_variaveis.pg;
// Exercício 1
// Faça uma função que receba dois valores como parâmetro e que no retorno sejam do tipo booleano.
// A função deve verificar se o primeiro número é divisível pelo segundo.
// boolean eDivisivel(int num, int divisor)
// NOTA: O fato de ser divisível pelo outro significa que ao dividir precisa dar um resultado exato, ou seja, sem decimais.

public class Ex1Funcoes {
    // procedimento
    static boolean eDivisivel(int num, int divisor) {
        int resto = num % divisor;
        if (resto == 0) {
            //System.out.println("É divisível. E o seu resultado e: " + resto);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean resultadoDivisivel = eDivisivel(11, 5);
        System.out.println(resultadoDivisivel);
    }
}





