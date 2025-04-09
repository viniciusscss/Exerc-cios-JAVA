package Exercicio04;

public class TesteJogador {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Lucas", 1500, 3);

        jogador1.exibirInfo();
        System.out.println();

        jogador1.aumentarPontuacao(250);
        jogador1.subirNivel();
        System.out.println();

        jogador1.exibirInfo();
    }
}
