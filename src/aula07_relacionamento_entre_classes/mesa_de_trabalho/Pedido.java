package aula07_relacionamento_entre_classes.mesa_de_trabalho;

import java.util.Date;
import java.util.List;

public class Pedido {
    private String dataPedido;
    private int codigo;
    private List<PedidoItem> itens;

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<PedidoItem> getItens() {
        return itens;
    }

    public void setItens(List<PedidoItem> itens) {
        this.itens = itens;
    }
}