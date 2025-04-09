import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pizza> cardapio = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Pizzas pré-cadastradas
        cardapio.add(new Pizza("Calabresa", 35.0, "Calabresa, cebola, mussarela"));
        cardapio.add(new Pizza("Margherita", 32.0, "Tomate, mussarela, manjericão"));
        cardapio.add(new Pizza("Quatro Queijos", 38.0, "Mussarela, parmesão, gorgonzola, catupiry"));

        int opcao;
        do {
            System.out.println("\n--- MENU PIZZARIA ---");
            System.out.println("1. Fazer um novo pedido");
            System.out.println("2. Cancelar um pedido");
            System.out.println("3. Listar todos os pedidos");
            System.out.println("4. Relatório de pedidos");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CARDÁPIO ---");
                    for (int i = 0; i < cardapio.size(); i++) {
                        System.out.println(i + 1 + ". " + cardapio.get(i));
                    }
                    System.out.print("Escolha o número da pizza: ");
                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    if (escolha < 1 || escolha > cardapio.size()) {
                        System.out.println("Opção inválida!");
                        break;
                    }

                    System.out.print("Tamanho (Pequena/Média/Grande): ");
                    String tamanho = scanner.nextLine();

                    System.out.print("Endereço de entrega: ");
                    String endereco = scanner.nextLine();

                    pedidos.add(new Pedido(cardapio.get(escolha - 1), tamanho, endereco));
                    System.out.println("Pedido adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Informe o número do pedido a ser cancelado: ");
                    int numCancel = scanner.nextInt();
                    if (numCancel >= 1 && numCancel <= pedidos.size()) {
                        pedidos.remove(numCancel - 1);
                        System.out.println("Pedido cancelado.");
                    } else {
                        System.out.println("Número inválido.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- LISTA DE PEDIDOS ---");
                    for (int i = 0; i < pedidos.size(); i++) {
                        System.out.println((i + 1) + ". " + pedidos.get(i));
                    }
                    break;

                case 4:
                    System.out.println("\n--- RELATÓRIO ---");
                    System.out.println("Total de pedidos: " + pedidos.size());
                    double total = 0;
                    for (Pedido p : pedidos) {
                        total += p.getValor();
                    }
                    System.out.println("Valor médio dos pedidos: R$" + (pedidos.size() > 0 ? total / pedidos.size() : 0));
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
