package aula05_classes.mesa_de_trabalho;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }

    public void aumentarPontuacao() {
        this.pontuacao += 10;
    }

    public int subirNivel() {
        return nivel ++;
    }

    public void bonus (int valor) {
        this.pontuacao += valor;
    }

    public String getNome() {
        return nome;
    }

    public String getNickname() {
        return nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }
}
