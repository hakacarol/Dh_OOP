package aula01_java.pg;

public class HelloWorld { // main = objeto
    public static void main(String args[]) {
        //write your code here!
        //tipo + nome = valor;
        System.out.println("Hello World");
        System.out.println(showMessage()); // o Java não é linear como oJS. Quando você chama uma funcao, ele procura no codigo inteiro.

        int valor1 = 15;
        float banana;
        banana = valor1/2;
        System.out.println(banana);
        //fazendo o exercicio do pg
    }
    public static String showMessage() {
        String myMessage= "Hello world inside a method";
        return myMessage;
    }
}

