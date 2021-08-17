package aula02_variaveis.pg;
// Objetivo
// O objetivo é poder praticar o uso da sintaxe da linguagem de programação Java.
// Exercício 1
// Digite seu nome e sobrenome separadamente, a partir dessas variáveis, você deve obter uma terceira com as suas iniciais

import java.util.Scanner;

public class Ex1PraticaIntegradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String sobrenome;

        System.out.println("Insira seu nome");
        nome= scanner.nextLine();
        System.out.println("Insira seu sobrenome");
        sobrenome= scanner.nextLine();

        System.out.println("Nome Completo: " + nome + " " + sobrenome);
        System.out.println("Iniciais: " + nome.charAt(0) + sobrenome.charAt(0));
    }
}
