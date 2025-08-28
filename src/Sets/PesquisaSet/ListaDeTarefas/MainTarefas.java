package Sets.PesquisaSet.ListaDeTarefas;

import java.util.Scanner;

public class MainTarefas {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        var optionMenu = 1;

        System.out.println("Collections Java");
        System.out.println("Exercício Conjunto de Tarefas");

        while (optionMenu != 0) {
            System.out.println("\nMenu das Tarefas");
            System.out.println("1. Adicionar tarefa(s)");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Total de tarefas");
            System.out.println("5. Tarefas concluídas");
            System.out.println("6. Tarefas pendentes");
            System.out.println("7. Concluir tarefa");
            System.out.println("8. Marcar como pendente tarefa");
            System.out.println("9. Limpar todas as tarefas");
            System.out.println("0. Sair");
            System.out.println("Opção desejada:");
            optionMenu = scanner.nextInt();

            var description = "";

            switch (optionMenu) {
                case 1:
                    System.out.println("Quantidade de tarefas para adicionar: ");
                    var amount = scanner.nextInt();

                    for (var i = 1; i <= amount; i++) {
                        System.out.println("Descrição:");
                        description = scanner.next();
                        listaTarefas.adicionarTarefa(description);
                    }
                    break;
                case 2:
                    System.out.println("Descrição da tarefa à ser removida:");
                    description = scanner.next();
                    if(listaTarefas.removerTarefa(description) != null){
                        System.out.printf("Tarefa %s removida com sucesso!", description);
                    } else {
                        System.out.printf("Tarefa %s inexistente", description);
                    }
                    break;
                case 3:
                    System.out.println("Listagem das tarefas");
                    listaTarefas.exibirTarefas();
                    break;
                case 4:
                    System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());
                    break;
                case 5:
                    System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
                    break;
                case 6:
                    System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
                    break;
                case 7:
                    System.out.println("Concluir tarefa de descrição: ");
                    description = scanner.next();
                    listaTarefas.marcarTarefaConcluida(description);
                    break;
                case 8:
                    System.out.println("Marcar tarefa como pendente de descrição: ");
                    description = scanner.next();
                    listaTarefas.marcarTarefaPendente(description);
                    break;
                case 9:
                    listaTarefas.limparListaTarefas();
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
            }
        }
    }
}
