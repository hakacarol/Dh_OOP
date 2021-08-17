package aula02_variaveis.pg;

public class ExemploFuncoes {
    // procedimento que faz a soma dos valores {}
    static void somar (int a, int b) { // void - indica que não irá ter retorno // static - qndo coloco static, torno o metodo em estático. O metodo fica funcional somente dentro da classe, não faz parte de um instanciamento de um obj
        int soma = a + b;
        System.out.println("A soma é " + soma);
    }

    public static void main(String[] args) { // o "main" é um metodo que não retorna valores ("void"), q recebe um arg, q é vetor de strings, que é um método estático e publico
        // chamando o procedimento
        System.out.println("Começou o programa: ");
        somar (10, 5);
    }
}