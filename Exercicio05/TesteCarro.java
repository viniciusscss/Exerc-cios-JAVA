public class TesteCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Chevrolet", "Opala", 1980, "ABC-1234");

        meuCarro.exibirInformacoes();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.exibirInformacoes();
    }
}
