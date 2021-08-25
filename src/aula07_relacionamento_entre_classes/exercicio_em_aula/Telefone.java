package aula07_relacionamento_entre_classes.exercicio_em_aula;

public class Telefone {

    private int ddd;
    private int numero;
    private TelefoneTipo tipo;

    public Telefone(int ddd, int numero, TelefoneTipo tipo) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public TelefoneTipo getTipo() {
        return tipo;
    }
}
