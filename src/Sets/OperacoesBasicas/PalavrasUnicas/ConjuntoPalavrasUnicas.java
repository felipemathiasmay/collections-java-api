package Sets.OperacoesBasicas.PalavrasUnicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> uniqueWords;

    public ConjuntoPalavrasUnicas() {
        this.uniqueWords = new HashSet<>();
    }

    //Adiciona uma palavra ao conjunto.
    public void adicionarPalavra(String palavra){
        uniqueWords.add(palavra);
    }

    //Remove uma palavra ao conjunto.
    public void removerPalavra(String palavra){
        if(!uniqueWords.isEmpty()) {
            if (uniqueWords.contains(palavra)) {
                uniqueWords.remove(palavra);
                System.out.printf("Palavra removida: %s\n", palavra);
            } else {
                System.out.println("Palavra não encontrada\n");
            }
        } else {
            System.out.println("Set de palavras vazia!\n");
        }
    }

    //Verifica se uma palavra está presente no conjunto.
    public void verificarPalavra(String palavra) {
        if(uniqueWords.contains(palavra)){
            System.out.printf("Palavra %s encontrada!\n", palavra);
        } else {
            System.out.printf("Palavra %s não encontrada!\n", palavra);
        }
    }

    //Exibe todas as palavras únicas do conjunto.
    public void exibirPalavrasUnicas(){
        if(!uniqueWords.isEmpty()) {
            System.out.println(uniqueWords);
        } else {
            System.out.println("Set de palavras vazia!\n");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(uniqueWords, that.uniqueWords);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(uniqueWords);
    }
}
