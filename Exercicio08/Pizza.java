public class Pizza {
    private String nome;
    private double preco;
    private String ingredientes;

    public Pizza(String nome, double preco, String ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco + " | Ingredientes: " + ingredientes;
    }
}
