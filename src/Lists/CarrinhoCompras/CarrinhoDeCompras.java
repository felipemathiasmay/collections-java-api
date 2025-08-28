package Lists.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    //Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
    public void adicionarItem(String name, double price, int amount){
        itemList.add(new Item(name, price, amount));
        System.out.println("Item adicionado ao carrinho");
    }

    //Remove um item do carrinho com base no seu nome.
    public void removerItem(String name){
        List<Item> toRemove = new ArrayList<>();

        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getName().equalsIgnoreCase(name)) {
                    toRemove.add(i);
                }
            }
            if(toRemove.isEmpty()) {
                System.out.printf("O item %s não está no seu carrinho!\n", name);
                return;
            }
            itemList.removeAll(toRemove);
            System.out.printf("O item %s foi removido!\n", name);
        } else {
            System.out.println("Carrinho está vazio");
        }

    }

    //Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    public double calcularValorTotal(){
        double totalPrice = 0d;

        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                double itemPrice = i.getPrice() * i.getAmount();
                totalPrice += itemPrice;
            }
        } else {
            System.out.println("Carrinho está vazio!");
        }
        return totalPrice;
    }

    //Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(itemList);
        } else {
            System.out.println("Carrinho está vazio!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }
}
