package aula07_relacionamento_entre_classes.mesa_de_trabalho;

public class Item {
    private String nomeProduto;
    private double preco;

    public Item(String nomeProduto, double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
}