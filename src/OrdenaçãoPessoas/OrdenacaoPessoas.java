package OrdenaçãoPessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    //Adiciona uma pessoa à lista.
    public void adicionarPessoa(String name, int age, double height){
        this.pessoaList.add(new Pessoa(name, age, height));
    }

    //Ordena as pessoas da lista por idade usando a interface Comparable.
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> agePerson = new ArrayList<>(pessoaList);
        Collections.sort(agePerson);
        return agePerson;
    }

    //Ordena as pessoas da lista por altura usando um Comparator personalizado.
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> heightPerson = new ArrayList<>(pessoaList);
        (heightPerson).sort(new ComparatorPorAltura());
        return heightPerson;
    }

}
