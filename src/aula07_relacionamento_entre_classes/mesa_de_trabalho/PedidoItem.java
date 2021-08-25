package aula07_relacionamento_entre_classes.mesa_de_trabalho;

public class PedidoItem {

    private int quantidade;
    private Item item;

    public PedidoItem(int quantidade, Item item) {
        this.quantidade = quantidade;
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Item getItem() {
        return item;
    }
}