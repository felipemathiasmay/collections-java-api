package Sets.PesquisaSet.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private final Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    //Adiciona uma nova tarefa ao Set.
    public void adicionarTarefa(String description) {
        tarefaSet.add(new Tarefa(description));
    }

    //Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
    public Tarefa removerTarefa(String description) {
        Tarefa toRemove = null;

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescription().equalsIgnoreCase(description)) {
                    toRemove = t;
                    break;
                }
            }
            tarefaSet.remove(toRemove);
        } else {
            System.out.println("Conjunto de tarefas vazio!");
        }
        return toRemove;
    }

    //Exibe todas as tarefas da lista de tarefas.
    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Conjunto de tarefas vazio!");
        }
    }

    //Conta o número total de tarefas na lista de tarefas.
    public int contarTarefas() {
        return (tarefaSet.size());
    }

    //Retorna um Set com as tarefas concluídas.
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> finishedTask = new HashSet<>();

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isFinished()) {
                    finishedTask.add(t);
                }
            }
        } else {
            System.out.println("Conjunto de tarefas vazio!");
        }
        return finishedTask;
    }

    //Retorna um Set com as tarefas pendentes.
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> toDoTask = new HashSet<>();

        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (!t.isFinished()) {
                    toDoTask.add(t);
                }
            }
        } else {
            System.out.println("Conjunto de tarefas vazio!");
        }
        return toDoTask;
    }

    //Marca uma tarefa como concluída de acordo com a descrição.
    public void marcarTarefaConcluida(String description) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescription().equalsIgnoreCase(description)) {
                    t.setFinished(true);
                    System.out.printf("Tarefa %s foi concluída\n", description);
                }
            }
        } else {
            System.out.println("Conjunto de tarefas vazio!");
        }
    }

    //Marca uma tarefa como pendente de acordo com a descrição.
    public void marcarTarefaPendente(String description) {
        Tarefa taskToDo = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                taskToDo = t;
                break;
            }
        }
        if (taskToDo != null) {
            if (taskToDo.isFinished()) {
                taskToDo.setFinished(false);
                System.out.printf("Tarefa %s foi marcada como pendente\n", description);
            }
        } else {
            System.out.printf("Tarefa %s encontrada na lista\n", description);
        }
    }

    //Remove todas as tarefas da lista de tarefas
    public void limparListaTarefas(){
        if(!tarefaSet.isEmpty()){
            tarefaSet.clear();
            System.out.println("Lista de tarefas limpa!");
        } else {
            System.out.println("Conjunto de tarefas já está vazio!");
        }
    }

}
