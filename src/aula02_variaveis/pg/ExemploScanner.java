package aula02_variaveis.pg;

import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner banana;
        banana = new Scanner(System.in);

        int num1;
        int num2;
        float coeficiente;
        String nome;
        char inicial;

        System.out.println("Insira um primeiro número");
        num1= banana.nextInt(); // Para a entrada de dados do tipo int é usado o método .nextInt ()
        System.out.println("Insira um segundo número");
        num2= banana.nextInt();
        System.out.println("Insira o coeficiente");
        coeficiente= banana.nextFloat();

        //??
        System.out.println("Digite seu nome");
        nome= banana.nextLine();

        inicial = nome.charAt(0);
        System.out.println(inicial);

    }
}
