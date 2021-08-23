package aula06_integracao.mesa_de_trabalho;

public class Main {
    public static void main(String[] args) {
        InstituicaoAnimais cachorro1 = new InstituicaoAnimais("SRD", 2020, true, 6, false, "July"); //adotado
        InstituicaoAnimais cachorro2 = new InstituicaoAnimais("SRD", 2019, false, 7, false, "Baleia"); //adotado

        System.out.println(cachorro2.podePerder());
        System.out.println(cachorro1.podePerder());
        System.out.println(cachorro1.isAdocao());
        System.out.println(cachorro2.isAdocao());

    }
}
