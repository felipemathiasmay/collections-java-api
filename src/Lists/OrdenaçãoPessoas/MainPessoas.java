package Lists.OrdenaçãoPessoas;

import java.util.Scanner;

public class MainPessoas {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        var optionMenu = 1;

        System.out.println("Collections Java");
        System.out.println("Exercício Ordenação");

        while (optionMenu != 0) {
            System.out.println("\nMenu do Catálogo");
            System.out.println("1. Adicionar Pessoa");
            System.out.println("2. Ordenar por idade");
            System.out.println("3. Ordenar por altura");
            System.out.println("0. Sair");
            System.out.println("Opção desejada:");
            optionMenu = scanner.nextInt();

            var name = "";
            var age = 0;
            var height = 0d;

            switch (optionMenu) {
                case 1:
                    System.out.println("Quantidade de pessoas para cadastrar:");
                    var quantNumbers = scanner.nextInt();

                    for (var i = 1; i <= quantNumbers; i++) {
                        System.out.printf("\nCadastro #%s:\n", i);
                        System.out.println("Nome:");
                        name = scanner.next();
                        System.out.println("Idade:");
                        age = scanner.nextInt();
                        System.out.println("Altura: ");
                        height = scanner.nextDouble();
                        ordenacaoPessoas.adicionarPessoa(name, age, height);
                    }
                    break;
                case 2:
                    System.out.println("Ordenação por idade: ");
                    System.out.println(ordenacaoPessoas.ordenarPorIdade());
                    break;
                case 3:
                    System.out.println("Ordenação por altura: ");
                    System.out.println(ordenacaoPessoas.ordenarPorAltura());
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
            }
        }
    }
}
