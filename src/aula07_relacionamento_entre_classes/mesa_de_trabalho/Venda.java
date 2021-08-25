package aula07_relacionamento_entre_classes.mesa_de_trabalho;

import java.util.ArrayList;

public class Venda {
    public static void main(String[] args) {
        Pedido pedido01 = new Pedido();
        pedido01.setCodigo(123456);
        pedido01.setDataPedido("23/08/2021");

        Item notebook = new Item( "notebook", 3999.49);
        Item headphone = new Item( "headphone", 450.00);
        Item mouse = new Item( "mouse", 249.49);
        Item chocolate = new Item( "chocolate", 7.49);

        PedidoItem notebooks = new PedidoItem(1, notebook);
        PedidoItem headphones = new PedidoItem(1, headphone);
        PedidoItem mouses = new PedidoItem(1, mouse);
        PedidoItem chocolates = new PedidoItem(8, chocolate);

        ArrayList<PedidoItem>itensComprados = new ArrayList<PedidoItem>();

        itensComprados.add(notebooks);
        itensComprados.add(headphones);
        itensComprados.add(mouses);
        itensComprados.add(chocolates);

        pedido01.setItens(itensComprados);

        Cliente cliente01 = new Cliente();
        cliente01.setNome("Carolina Hakamada");
        cliente01.setTelefone("+5579991563776");
        cliente01.setEndereco("Rua Correia de Lemos, 642");
        cliente01.setCep("06709320");

        cliente01.setPedido(pedido01);

        System.out.println("FIM");
    }
}