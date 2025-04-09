package Exercicio04;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacaoInicial, int nivelInicial) {
        this.nome = nome;
        this.pontuacao = pontuacaoInicial;
        this.nivel = nivelInicial;
    }

    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            pontuacao += pontos;
            System.out.println(pontos + " pontos adicionados!");
        } else {
            System.out.println("Pontuação inválida.");
        }
    }

    public void subirNivel() {
        nivel++;
        System.out.println("Parabéns! " + nome + " subiu para o nível " + nivel + "!");
    }

    public void exibirInfo() {
        System.out.println("Jogador: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}
