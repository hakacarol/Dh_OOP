package aula07_relacionamento_entre_classes.exercicio_em_aula;

import java.util.ArrayList;

public class Viagem {
    public static void main(String[] args) {
        Passageiro carolina = new Passageiro();
        carolina.setCpf("360706433");
        carolina.setNome("CAROLINA HAKAMADA");

        Endereco origem = new Endereco();
        origem.setBairro("CENTRO");
        origem.setCidade("SAO PAULO");
        origem.setLogradouro("RUA 13 DE MAIO");
        origem.setUf("SP");
        origem.setNumero("351");

        carolina.setOrigem(origem);

        ArrayList<Telefone>telefones = new ArrayList<Telefone>();
        Telefone telefone = new Telefone(11, 8755, TelefoneTipo.WHATSAPP);
        Telefone whats = new Telefone (11, 8755, TelefoneTipo.FIXO);

        telefones.add(telefone);
        telefones.add(whats);

        carolina.setTelefones(telefones);

        Endereco destino = new Endereco();
        destino.setBairro("ZONA SUL");
        destino.setCidade("RIO DE JANEIRO");
        destino.setLogradouro("AV MORUMBI");
        destino.setUf("RJ");
        destino.setNumero("4545");

        ArrayList<Endereco>destinos = new ArrayList<Endereco>();
        destinos.add(destino);

        carolina.setDestinos(destinos);

        System.out.println("FIM");
    }
}
