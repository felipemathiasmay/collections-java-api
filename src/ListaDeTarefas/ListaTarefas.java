package ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private final List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    //Adiciona uma nova tarefa à lista com a descrição fornecida.
    public void adicionarTarefa(String description){
        tarefaList.add(new Tarefa(description));
        System.out.println("Tarefa adicionada à lista!");
    }

    //Remove uma tarefa da lista com base em sua descrição.
    public void removerTarefa(String description){
        List<Tarefa> toRemove = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if (t.getDescription().equalsIgnoreCase(description)){
                toRemove.add(t);
            }
        }
        tarefaList.removeAll(toRemove);
    }

    //Retorna o número total de tarefas na lista.
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    //Retorna uma lista contendo a descrição de todas as tarefas na lista.
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
}
