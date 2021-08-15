package aula02_variaveis.pg;
/* Ex01 - Defina duas sequências de texto. Verifique se são iguais ou diferentes e indique por meio de mensagem.
Ex02 - Defina duas variáveis Integer e determine pelo valor delas qual é maior, qual é menor ou se são iguais. */

public class Ex1IntegerEString {
    public static void main(String[] args) {
        // Ex01
        String frase1 = "Tenho uma banana";
        String frase2 = "Tenho uma banana e um chiclete";
        String frase3 = "Tenho uma banana";

        if (frase1.equals(frase2))
            System.out.println("A frases são iguais");
        else {
            System.out.println("As frases são diferentes");
        }
        // Testando com a opção de frases iguais
        if (frase1.equals(frase3))
            System.out.println("As frases são iguais");
        else {
            System.out.println("As frases são diferentes");
        }

        // Ex02
        Integer valor1 = 5;
        Integer valor2 = 15;
        int comparar;

        if (valor1.equals(valor2))
            System.out.println("Os dois numeros são iguais a " + valor1);
        else
        {comparar = valor1.compareTo(valor2); // valor1 > -> 1 / valor2 > -1
            if (comparar > 0)
                System.out.println(valor1 + " é maior que " + valor2);
            else
                System.out.println(valor2 + " é maior que " + valor1);
        }
    }
}
