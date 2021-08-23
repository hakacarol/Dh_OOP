package aula06_integracao.mesa_de_trabalho;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstituicaoAnimais {
    private boolean adocao;
    private String raca;
    private int anoNascimento;
    private boolean chip;
    private float peso;
    private boolean ferido;
    private String nome;

    public InstituicaoAnimais(String raca, int anoNascimento, boolean chip, float peso, boolean ferido, String nome) {
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.chip = chip;
        this.peso = peso;
        this.ferido = ferido;
        this.nome = nome;
    }

    public boolean isAdocao() {
        return adocao;
    }

    public String getRaca() {
        return raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public boolean isChip() {
        return chip;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isFerido() {
        return ferido;
    }

    public String getNome() {
        return nome;
    }

    public int idadeAnimal(){
    return 2021 - this.anoNascimento;
    }

    public boolean podePerder() {
        if (chip) {
            return false;
        } else {
            return true;
        }
    }

    public void podeAdotar() {
        if(this.ferido){
            this.adocao = false;
        } else if (this.peso >= 5) {
            this.adocao = true;
        } else {
            this.adocao = false;
        }
    }
}
