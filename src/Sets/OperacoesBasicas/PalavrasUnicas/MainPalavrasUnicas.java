package Sets.OperacoesBasicas.PalavrasUnicas;

import java.util.Scanner;

public class MainPalavrasUnicas {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        var optionMenu = 1;

        System.out.println("Collections Java");
        System.out.println("Exercício Conjunto de Palavras únicas");

        while (optionMenu != 0) {
            System.out.println("\nMenu das Palavras");
            System.out.println("1. Adicionar palavras");
            System.out.println("2. Remover palavra");
            System.out.println("3. Verificar palavra");
            System.out.println("4. Listagem das palavras");
            System.out.println("0. Sair");
            System.out.println("Opção desejada:");
            optionMenu = scanner.nextInt();

            var word = "";

            switch (optionMenu) {
                case 1:
                    System.out.println("Quantidade de palavras para adicionar: ");
                    var amount = scanner.nextInt();

                    for (var i = 1; i <= amount; i++) {
                        System.out.println("Palavra:");
                        word = scanner.next();
                        conjuntoPalavrasUnicas.adicionarPalavra(word);
                    }
                    break;
                case 2:
                    System.out.println("Palavra para ser removida:");
                    word = scanner.next();
                    conjuntoPalavrasUnicas.removerPalavra(word);
                    break;
                case 3:
                    System.out.println("Palavra para ser verificada:");
                    word = scanner.next();
                    conjuntoPalavrasUnicas.verificarPalavra(word);
                    break;
                case 4:
                    System.out.println("\nListagem das palavras:");
                    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
            }
        }
    }
}
