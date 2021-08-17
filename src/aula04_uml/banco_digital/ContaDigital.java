package aula04_uml.banco_digital;

public class ContaDigital {
    public static void main(String[] args) {
        ContaDebito conta = new ContaDebito();
        conta.setNomeTitular("Carolina Hakamada");

        System.out.println(conta.getNomeTitular());
        System.out.println(conta.getSaldo());
        conta.depositar(150.00);
    }
}
