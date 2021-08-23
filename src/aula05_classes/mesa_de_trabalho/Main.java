package aula05_classes.mesa_de_trabalho;

public class Main {
    public static void main(String[] args) {
        UsuarioJogo usuario1 = new UsuarioJogo("Carol", "Haka");
        usuario1.aumentarPontuacao();
        System.out.println(usuario1.getPontuacao());

        usuario1.bonus(1000);
        System.out.println(usuario1.getPontuacao());

        usuario1.subirNivel();
        System.out.println(usuario1.getNivel());

        UsuarioJogo usuario2 = new UsuarioJogo("Marco Aurelio", "Marcolerio");
        System.out.println(usuario2.getPontuacao());

        usuario2.aumentarPontuacao();
        usuario2.aumentarPontuacao();
        usuario2.bonus(2000);
        System.out.println(usuario2.getPontuacao());

        usuario2.subirNivel();
        usuario2.subirNivel();
        System.out.println(usuario2.getNivel());
    }
}
