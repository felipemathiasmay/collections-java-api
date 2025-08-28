package Sets.Ordenacao.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    //Adiciona um aluno ao conjunto.
    public void adicionarAluno(String name, Long registration, double average){
        alunoSet.add(new Aluno(name, registration, average));
        System.out.println("Aluno adicionado com sucesso!");
    }

    //Remove um aluno ao conjunto a partir da registration, se estiver presente.
    public void removerAluno(long registration){
        if(!alunoSet.isEmpty()){
            alunoSet.removeIf(aluno -> aluno.getRegistration() == registration);
        } else {
            System.out.println("Conjunto de alunos vazio !");
        }
    }

    //Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
    public void exibirAlunosPorNome(){
        Set<Aluno> alphabeticalOrder = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            System.out.println(alphabeticalOrder);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    //Exibe todos os alunos do conjunto em ordem crescente de nota.
    public void exibirAlunosPorNota(){
        Set<Aluno> averageOrder = new TreeSet<>(new ComparatorPorMedia());
        if (!alunoSet.isEmpty()) {
            averageOrder.addAll(alunoSet);
            System.out.println(averageOrder);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    //Exibe todos os alunos do conjunto.
    public void exibirAlunos(){
        System.out.println(alunoSet);
    }
}
