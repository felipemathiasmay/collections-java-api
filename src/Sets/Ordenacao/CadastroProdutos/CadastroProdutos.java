package Sets.Ordenacao.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //Adiciona um produto ao cadastro.
    public void adicionarProduto(long code, String name, double price, int quantity){
        produtoSet.add(new Produto(code, name, price, quantity));
    }

    //Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> perName = new TreeSet<>(produtoSet);
        return perName;

    }

    //Exibe todos os produtos do cadastro em ordem crescente de preço.
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> perPrice = new TreeSet<>(new ComparatorPorPreco());
        perPrice.addAll(produtoSet);
        return perPrice;
    }
}
