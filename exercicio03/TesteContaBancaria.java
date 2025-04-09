package Exercicio03;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6", "João da Silva", 1000.00);

        conta.exibirInfo();
        System.out.println();

        conta.depositar(500.00);
        conta.sacar(200.00);
        conta.sacar(2000.00); // teste com valor maior que o saldo
        System.out.println();

        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
