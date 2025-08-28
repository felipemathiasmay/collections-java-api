package Lists.ListaDeTarefas;

public class Tarefa {

    private String description;

    public Tarefa() {
    }

    public Tarefa(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "description='" + description + '\'' +
                '}';
    }
}
