package Sets.Ordenacao.CadastroProdutos;

import java.util.Random;
import java.util.Scanner;

public class MainProdutos {

    private static final Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        var optionMenu = 1;

        System.out.println("Collections Java");
        System.out.println("Exercício Conjunto de Produtos");

        while (optionMenu != 0) {
            System.out.println("\nMenu de Produtos");
            System.out.println("1. Adicionar produto(s)");
            System.out.println("2. Exibir produtos pelo nome");
            System.out.println("3. Exibir produtos pelo preço");
            System.out.println("0. Sair");
            System.out.println("Opção desejada:");
            optionMenu = scanner.nextInt();

            var code = 0L;
            var name = "";
            var price = 0d;
            var  quantity = 0;

            switch (optionMenu) {
                case 1:
                    System.out.println("Quantidade de contatos para adicionar: ");
                    var amount = scanner.nextInt();

                    for (var i = 1; i <= amount; i++) {
                        System.out.printf("Produto #%s\n", i);
                        code = random.nextLong(9999999);
                        System.out.println("Nome:");
                        name = scanner.next();
                        System.out.println("Preço:");
                        price = scanner.nextDouble();
                        System.out.println("Quantidade:");
                        quantity = scanner.nextInt();
                        cadastroProdutos.adicionarProduto(code, name, price, quantity);
                    }
                    break;
                case 2:
                    System.out.println("Produtos em ordem alfabética");
                    System.out.println(cadastroProdutos.exibirProdutosPorNome());
                    break;
                case 3:
                    System.out.println("Produtos pela ordem crescente de preço");
                    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
            }
        }
    }
}
