package aula05_classes.exercicios_aula.vendas;

import aula05_classes.exercicios_aula.frota.Carro;

public class Faturamento {
    public static void main(String[] args) {
        Carro fiatUno = new Carro(2021,"5gxafsad");
        Carro fiatArgo = new Carro(2019,"8676hsdhf");

        //fiatUno.setPlaca("ABC-4567");
        fiatArgo.setPlaca("GBC-0976");

        fiatUno.acelerarPadrao();

        fiatUno.acelerar(25);

        System.out.println(fiatUno.getKmPercorrido());
        System.out.println(fiatArgo.getKmPercorrido());

    }
}
