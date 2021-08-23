package aula06_integracao.exercicio_impressora;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Date data = new Date();

        Impressora impressora = new Impressora( "Epson", "wifi", LocalDate.of(2021,8,19), 100);
        System.out.println(impressora.getDataFabricacao());
        impressora.imprimir("Olá, mundo! :)");
    }
}
