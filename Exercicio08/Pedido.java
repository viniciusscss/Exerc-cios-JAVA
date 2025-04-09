public class Pedido {
    private Pizza pizza;
    private String tamanho;
    private String endereco;

    public Pedido(Pizza pizza, String tamanho, String endereco) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.endereco = endereco;
    }

    public double getValor() {
        return pizza.getPreco();
    }

    @Override
    public String toString() {
        return "Pizza: " + pizza.getNome() +
               " | Tamanho: " + tamanho +
               " | Valor: R$" + pizza.getPreco() +
               " | Endereço: " + endereco;
    }
}
