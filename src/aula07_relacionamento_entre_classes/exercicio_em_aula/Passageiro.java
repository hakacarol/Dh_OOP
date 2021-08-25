package aula07_relacionamento_entre_classes.exercicio_em_aula;

import java.util.List;

public class Passageiro {
    private String cpf;
    private String nome;
    private Endereco origem;
    private List<Endereco> destinos;
    private List<Telefone> telefones;

    public List<Endereco> getDestinos() {
        return destinos;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Endereco getOrigem() {
        return origem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setOrigem(Endereco origem) {
        this.origem = origem;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDestinos(List<Endereco> destinos) {
        this.destinos = destinos;
    }
}
