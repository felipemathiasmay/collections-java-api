package Sets.PesquisaSet.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private final Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //Adiciona um contato à agenda.
    public void adicionarContato(String name, int number) {
        contatoSet.add(new Contato(name, number));
    }

    //Exibe todos os contatos da agenda.
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    //Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
    public Set<Contato> pesquisarPorNome(String name){
        Set<Contato> foundName = new HashSet<>();

        if(!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getName().startsWith(name)) {
                    foundName.add(c);
                    System.out.printf("Contato com nome %s encontrado!\n", name);
                    break;
                }
            }
            if(foundName.isEmpty()) {
                System.out.printf("Contato %s não encontrado\n", name);
            }
        } else {
            System.out.println("Conjunto de contatos está vazio!");
        }
        return foundName;
    }

    //Atualiza o número de telefone de um contato específico.
    public Contato atualizarNumeroContato(String name, int newNumber){
        Contato attContact = null;

        if(!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getName().equalsIgnoreCase(name)) {
                    c.setNumber(newNumber);
                    attContact = c;
                    System.out.printf("Número do contato %s foi atualizado para %s!\n", name, newNumber);
                    break;
                }
            }
            if (attContact == null) {
                System.out.printf("Contato %s não encontrado\n", name);
            }
        } else {
            System.out.println("Conjunto de contatos está vazio!");
        }
        return attContact;
    }
}
