package aula02_variaveis.pg;

public class ExemploFuncoes2 {
    // funções são as rotinas q retornam valores // apresenta o tipo do retorno
    static int somar (int a, int b) { // void - indica que não irá ter retorno
        int soma = a + b;
        return soma;
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa: ");
        int somaResultado = somar(10, 5);
        System.out.println("A soma é: " + somaResultado);
    }
}