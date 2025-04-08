import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        agenda.adicionarContato(new Contato("Vinicius", "99999-1234"));
        agenda.adicionarContato(new Contato("Lucas", "88888-5678"));

        System.out.print("Digite o nome do contato que deseja buscar: ");
        String nomeBusca = scanner.nextLine();

        Contato resultado = agenda.buscarContatoPorNome(nomeBusca);

        if (resultado != null) {
            System.out.println("Contato encontrado: " + resultado);
        } else {
            System.out.println("Contato não encontrado.");
        }

        System.out.println("\nTodos os contatos:");
        agenda.exibirContatos();

        scanner.close();
    }
}
