package Sets.PesquisaSet.AgendaDeContatos;

import java.util.Scanner;

public class MainContato {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();
        var optionMenu = 1;

        System.out.println("Collections Java");
        System.out.println("Exercício Conjunto de Contatos");

        while (optionMenu != 0) {
            System.out.println("\nMenu de Contatos");
            System.out.println("1. Adicionar contato(s)");
            System.out.println("2. Exibir contatos");
            System.out.println("3. Pesquisar contatos pelo nome");
            System.out.println("4. Atualizar número do contato");
            System.out.println("0. Sair");
            System.out.println("Opção desejada:");
            optionMenu = scanner.nextInt();

            var name = "";
            var number = 0;

            switch (optionMenu) {
                case 1:
                    System.out.println("Quantidade de contatos para adicionar: ");
                    var amount = scanner.nextInt();

                    for (var i = 1; i <= amount; i++) {
                        System.out.println("Nome:");
                        name = scanner.next();
                        System.out.println("Número:");
                        number = scanner.nextInt();
                        agendaContatos.adicionarContato(name, number);
                    }
                    break;
                case 2:
                    agendaContatos.exibirContatos();
                    break;
                case 3:
                    System.out.println("Nome do contato: ");
                    name = scanner.next();
                    System.out.println(agendaContatos.pesquisarPorNome(name));
                    break;
                case 4:
                    System.out.println("Nome do contato: ");
                    name = scanner.next();
                    System.out.println("\nNovo número:");
                    var newNumber = scanner.nextInt();
                    System.out.println(agendaContatos.atualizarNumeroContato(name, newNumber));
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
            }
        }
    }
}
