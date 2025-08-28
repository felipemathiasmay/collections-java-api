package Lists.ListaDeTarefas;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        var optionMenu = 1;

        System.out.println("Collections Java");
        System.out.println("Exercício Tarefas");

        while (optionMenu != 0) {
            System.out.println("\nMenu Tarefas");
            System.out.println("1. Adicionar tarefa à lista");
            System.out.println("2. Remove tarefa da lista");
            System.out.println("3. Número total de tarefas na lista");
            System.out.println("4. Listagem das tarefas da lista");
            System.out.println("0. Sair");
            System.out.println("Opção desejada:");
            optionMenu = scanner.nextInt();

            var description = "";

            switch (optionMenu){
                case 1:
                    System.out.println("Descrição da tarefa:");
                    description = scanner.next();
                    listaTarefas.adicionarTarefa(description);
                    break;
                case 2:
                    System.out.println("Descrição da tarefa para ser removida:");
                    description = scanner.next();
                    listaTarefas.removerTarefa(description);
                    break;
                case 3:
                    System.out.println("Total de tarefas em sua lista: " + listaTarefas.obterNumeroTotalTarefas());
                    break;
                case 4:
                    System.out.println("Tarefas da sua lista:");
                    listaTarefas.obterDescricoesTarefas();
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
            }
        }

    }
}