package aula02_variaveis.exercicio_em_aula;

import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String meuPrimeiroNome;
        System.out.println("Digite seu nome");
        meuPrimeiroNome = scanner.next();
        System.out.println("Meu nome é: " + meuPrimeiroNome);

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Minha idade é: " + idade);

        // entrada de dados
        // pode ter tipos diferentes
        // que eu preciso exibir
    }
}
