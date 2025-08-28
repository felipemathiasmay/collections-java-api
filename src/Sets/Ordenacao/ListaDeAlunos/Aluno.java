package Sets.Ordenacao.ListaDeAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

    private String name;
    private final long registration;
    double average;

    public Aluno(String name, long registration, double average) {
        this.name = name;
        this.registration = registration;
        this.average = average;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return name.compareToIgnoreCase(aluno.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRegistration() {
        return registration;
    }


    public double getAverage() {
        return average;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", registration=" + registration +
                ", average=" + average +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return registration == aluno.registration;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(registration);
    }
}

class ComparatorPorMedia implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getAverage(), a2.getAverage());
    }
}
