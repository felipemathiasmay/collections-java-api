package PesquisaLivros;

import java.util.Scanner;

public class MainLivros {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        var optionMenu = 1;

        System.out.println("Collections Java");
        System.out.println("Exercício Pesquisa de Livros");

        while (optionMenu != 0) {
            System.out.println("\nMenu do Catálogo");
            System.out.println("1. Adicionar livro ao catálogo");
            System.out.println("2. Pesquisar por autor");
            System.out.println("3. Pesquisar entre intervalo de anos ");
            System.out.println("4. Pesquisar por título");
            System.out.println("0. Sair");
            System.out.println("Opção desejada:");
            optionMenu = scanner.nextInt();

            var title = "";
            var author = "";
            var publicationYear = 0;

            switch (optionMenu){
                case 1:
                    System.out.println("Nome do livro:");
                    title = scanner.next();
                    System.out.println("Autor:");
                    author = scanner.next();
                    System.out.println("Ano de publicação:");
                    publicationYear = scanner.nextInt();
                    catalogoLivros.adicionarLivro(title, author, publicationYear);
                    break;
                case 2:
                    System.out.println("Nome do autor: ");
                    author = scanner.next();
                    System.out.println(catalogoLivros.pesquisarPorAutor(author));
                    break;
                case 3:
                    System.out.println("Ano inicial: ");
                    var initialYear = scanner.nextInt();
                    System.out.println("Ano final: ");
                    var endYear = scanner.nextInt();
                    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(initialYear, endYear));
                    break;
                case 4:
                    System.out.println("Título do livro: ");
                    title = scanner.next();
                    System.out.println(catalogoLivros.pesquisarPorTitulo(title));
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
            }
        }

    }
}
