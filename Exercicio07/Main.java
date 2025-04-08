import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU DE GERENCIAMENTO DE ESTOQUE ---");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Atualizar produto");
            System.out.println("3. Remover produto");
            System.out.println("4. Exibir relatório de estoque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int qtd = scanner.nextInt();

                    estoque.add(new Produto(nome, codigo, preco, qtd));
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Informe o código do produto a atualizar: ");
                    String codAtualizar = scanner.nextLine();
                    boolean encontrado = false;
                    for (Produto p : estoque) {
                        if (p.getCodigo().equals(codAtualizar)) {
                            System.out.print("Novo nome: ");
                            p.setNome(scanner.nextLine());
                            System.out.print("Novo preço: ");
                            p.setPreco(scanner.nextDouble());
                            System.out.print("Nova quantidade: ");
                            p.setQuantidade(scanner.nextInt());
                            System.out.println("Produto atualizado.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) System.out.println("Produto não encontrado.");
                    break;

                case 3:
                    System.out.print("Informe o código do produto a remover: ");
                    String codRemover = scanner.nextLine();
                    estoque.removeIf(p -> p.getCodigo().equals(codRemover));
                    System.out.println("Produto removido (se existia).");
                    break;

                case 4:
                    double total = 0;
                    System.out.println("\n--- ESTOQUE ATUAL ---");
                    for (Produto p : estoque) {
                        System.out.println(p);
                        total += p.calcularValorTotal();
                    }
                    System.out.printf("Valor total em estoque: R$ %.2f\n", total);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
