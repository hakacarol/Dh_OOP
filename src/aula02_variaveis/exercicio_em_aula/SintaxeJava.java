package aula02_variaveis.exercicio_em_aula;

import java.util.Scanner;
// Objetivo
// Praticar a sintaxe usando a linguagem de programação Java.
// Exercício 1
// Digite seu nome e sobrenome separadamente, a partir dessas variáveis obtenha em uma terceira, suas iniciais e sua data de nascimento, para a data digite 3 valores que representam dia, mês e ano.
// Em seguida, exiba uma mensagem, como se fosse um token, com seu nomes, as iniciais do seu nome e sobrenome e sua data de nascimento no formato "dd / mm / aaaa"
// Nota: Use alguma função para resolver, por exemplo, dados os 3 valores, retorne a data como uma string.

public class SintaxeJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String sobrenome;

        System.out.println("Insira seu nome");
        nome= scanner.nextLine();
        System.out.println("Insira seu sobrenome");
        sobrenome= scanner.nextLine();

        System.out.println("Digite seu Dia de Nascimento: ");
        int dia = scanner.nextInt();

        System.out.println("Digite seu Mês de Nascimento: ");
        int mes = scanner.nextInt();

        System.out.println("Digite seu Ano de Nascimento: ");
        int ano = scanner.nextInt();

        String meuNiverFormatado = dataFormatada(dia,mes,ano);

        System.out.println("Nome Completo: " + nome + sobrenome);
        System.out.println("Iniciais: " + nome.charAt(0) + sobrenome.charAt(0));
        System.out.println("Aniversário é: " + meuNiverFormatado);
    }
    static String dataFormatada(int dia, int mes, int ano) {
        return  dia+"/"+mes+"/"+ano;
    }
}
