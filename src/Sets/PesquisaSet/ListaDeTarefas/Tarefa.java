package Sets.PesquisaSet.ListaDeTarefas;

public class Tarefa {

    private String description;
    private boolean isFinished;

    public Tarefa(String description) {
        this.isFinished = false;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "description='" + description + '\'' +
                ", isFinished=" + isFinished +
                '}';
    }
}
