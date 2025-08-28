package CarrinhoCompras;

import java.util.Scanner;

public class MainCompras {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        var optionMenu = 1;

        System.out.println("Collections Java");
        System.out.println("Exercício Carrinho de compras");

        while (optionMenu != 0) {
            System.out.println("\nMenu de Compras");
            System.out.println("1. Adicionar item ao carrinho");
            System.out.println("2. Remove item do carrinho");
            System.out.println("3. Valor total");
            System.out.println("4. Listagem dos itens do seu carrinho");
            System.out.println("0. Sair");
            System.out.println("Opção desejada:");
            optionMenu = scanner.nextInt();

            var name = "";
            var price = 0d;
            var amount = 0;

            switch (optionMenu){
                case 1:
                    System.out.println("Nome do produto:");
                    name = scanner.next();
                    System.out.println("Preço:");
                    price = scanner.nextDouble();
                    System.out.println("Quantidade:");
                    amount = scanner.nextInt();
                    carrinhoDeCompras.adicionarItem(name, price, amount );
                    break;
                case 2:
                    System.out.println("Nome do produto a ser removido:");
                    name = scanner.next();
                    carrinhoDeCompras.removerItem(name);
                    break;
                case 3:
                    System.out.println("Valor total do carrinho: " + carrinhoDeCompras.calcularValorTotal());
                    break;
                case 4:
                    System.out.println("Listagem do produtos do seu carrinho:");
                    carrinhoDeCompras.exibirItens();
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
            }
        }

    }
}