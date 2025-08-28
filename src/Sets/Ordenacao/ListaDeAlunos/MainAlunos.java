package Sets.Ordenacao.ListaDeAlunos;

import java.util.Random;
import java.util.Scanner;

public class MainAlunos {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        var optionMenu = 1;

        System.out.println("Collections Java");
        System.out.println("Exercício Conjunto de Produtos");

        while (optionMenu != 0) {
            System.out.println("\nMenu de Produtos");
            System.out.println("1. Adicionar aluno(s)");
            System.out.println("2. Remover aluno");
            System.out.println("3. Exibir alunos em ordem alfabética");
            System.out.println("4. Exibir alunos pela média em ordem crescente");
            System.out.println("5. Listagem alunos");
            System.out.println("0. Sair");
            System.out.println("Opção desejada:");
            optionMenu = scanner.nextInt();

            var registration = 0L;
            var name = "";
            var average = 0d;

            switch (optionMenu) {
                case 1:
                    System.out.println("Quantidade de alunos para adicionar: ");
                    var amount = scanner.nextInt();

                    for (var i = 1; i <= amount; i++) {
                        registration = random.nextLong(9999999);
                        System.out.printf("%s. Aluno #%s\n", i, registration);
                        System.out.println("Nome:");
                        name = scanner.next();
                        System.out.println("Média:");
                        average = scanner.nextDouble();
                        gerenciadorAlunos.adicionarAluno(name, registration, average);
                    }
                    break;
                case 2:
                    System.out.println("Matrícula do aluno:");
                    registration = scanner.nextLong();
                    gerenciadorAlunos.removerAluno(registration);
                    break;
                case 3:
                    System.out.println("Aluno em ordem alfabética: ");
                    gerenciadorAlunos.exibirAlunosPorNome();
                    break;
                case 4:
                    System.out.println("Notas em ordem crescente: ");
                    gerenciadorAlunos.exibirAlunosPorNota();
                    break;
                case 5:
                    System.out.println("Lista dos alunos: ");
                    gerenciadorAlunos.exibirAlunos();
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
            }
        }
   }
}
