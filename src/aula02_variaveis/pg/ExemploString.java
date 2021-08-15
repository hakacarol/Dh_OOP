package aula02_variaveis.pg;

public class ExemploString {
    public static void main(String[] args) {
        String nome = "João";
        int quantidade;
        char inicial;

        quantidade = nome.length();
        System.out.println(quantidade);
        //??
        nome.toUpperCase();

        if (nome.equals("JOÃO")) {
            System.out.println("Está em maiúscula: " + nome);
        }
        inicial = nome.charAt(0);
        System.out.println("Iniciais: " + nome.charAt(0));
    }
}
