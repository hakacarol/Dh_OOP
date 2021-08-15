package aula01_java.mesa_de_trabalho_mascote;

public class Main {
        public static void main(String[] args) { //vamos instanciar/criar os objetos
            Mascote mascote1 = new Mascote("cachorro", "Shesheu", 2, 1.5f, "wolf wolf");
            Mascote mascote2 = new Mascote("peixe", "Nemo", 1, 0.140f, "glub glub");
            Mascote mascote3 = new Mascote("gato", "Snow", 3, 0.5f, "meow meow");

            // vamos imprimir o resultado
            System.out.println("O " + mascote1.nome + " é um " + mascote1.tipo + ", tem " + mascote1.idade + " anos, come " + mascote1.qtdComida + " kg de comida e faz " + mascote1.som + ".");
            System.out.println("O " + mascote2.nome + " é um " + mascote2.tipo + ", tem " + mascote2.idade + " anos, come " + mascote2.qtdComida + " kg de comida e faz " + mascote2.som + ".");
            System.out.println("O " + mascote3.nome + " é um " + mascote3.tipo + ", tem " + mascote3.idade + " anos, come " + mascote3.qtdComida + " kg de comida e faz " + mascote3.som + ".");
        }
}
