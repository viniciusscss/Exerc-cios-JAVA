public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public String getCodigo() { return codigo; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Código: " + codigo + " | Preço: R$ " + preco + " | Quantidade: " + quantidade;
    }
}
