import java.util.ArrayList;
import java.util.Scanner;

class Tarefa {

    private ArrayList<String> tarefas = new ArrayList<>();

    public void adicionarTarefa(String nome) {
        tarefas.add(nome);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            System.out.println("Tarefa removida!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            System.out.println("=== LISTA DE TAREFAS ===");
            for (int i = 0; i < tarefas.size(); i++) { //se for 1, ele nao pega o index 0 da lista.
                System.out.println(i + " - " + tarefas.get(i));
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Tarefa tarefa = new Tarefa();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome da tarefa: ");
                    String nome = scanner.nextLine();
                    tarefa.adicionarTarefa(nome);
                    break;

                case 2:
                    tarefa.listarTarefas();
                    System.out.print("Digite o índice da tarefa para remover: ");
                    int indice = scanner.nextInt();
                    tarefa.removerTarefa(indice);
                    break;

                case 3:
                    tarefa.listarTarefas();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
