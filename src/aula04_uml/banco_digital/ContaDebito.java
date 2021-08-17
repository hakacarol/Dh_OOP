package aula04_uml.banco_digital;

public class ContaDebito { // estrutura penso em classe
    private String nomeTitular;
    private Integer numero;
    private Integer diaMes;
    private Double saldo = 0.0;

    public void depositar (Double valor) {
        saldo = saldo + valor;
    }
    public void sacar (Double valor) {
        saldo = saldo - valor;
    }
    //criando um metodo para ter um acesso ao nome
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public Double getSaldo(){
        return saldo;
    }
}
