package aula06_integracao.exercicio_impressora;

import java.time.LocalDate;
import java.util.Date;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;

    // criando um construtor da classe (serve p/ instanciar o objeto com atributos definidos)
    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis) {
        this.modelo = modelo;
        this.dataFabricacao = dataFabricacao;
        this.tipoConexao = tipoConexao;
        this.folhasDisponiveis = 0;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }
    private boolean temFolha() {
        return folhasDisponiveis > 0;
    }

    public String imprimir(String texto){
        if (temFolha()) {
           this.folhasDisponiveis--;
           return texto;
        } else {
            return "Não tem folha";
        }
    }
}
