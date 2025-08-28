package Sets.OperacoesBasicas.ConjuntoDeConvidados;

import java.util.Random;
import java.util.Scanner;

public class ConvidadoMain {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        var optionMenu = 1;

        System.out.println("Collections Java");
        System.out.println("Exercício Conjunto de Convidados");

        while (optionMenu != 0) {
            System.out.println("\nMenu de Convidados");
            System.out.println("1. Adicionar convidado");
            System.out.println("2. Remover convidado");
            System.out.println("3. Quantidade de convidados");
            System.out.println("4. Listagem dos convidados");
            System.out.println("0. Sair");
            System.out.println("Opção desejada:");
            optionMenu = scanner.nextInt();

            var name = "";
            var codInvite = 0;

            switch (optionMenu) {
                case 1:
                    System.out.println("Quantidade de convidados para adicionar: ");
                    var amount = scanner.nextInt();

                    for (var i = 1; i <= amount; i++) {
                        System.out.println("Nome:");
                        name = scanner.next();
                        codInvite = random.nextInt(100);
                        conjuntoConvidados.adicionarConvidado(name, codInvite);
                    }
                    break;
                case 2:
                    System.out.println("Código do convite:");
                    codInvite = scanner.nextInt();
                    conjuntoConvidados.removerConvidadoPorCodigoConvite(codInvite);
                    break;
                case 3:
                    System.out.println("Quantidade total de convidados: " + conjuntoConvidados.contarConvidados());
                    break;
                case 4:
                    System.out.println("\nListagem dos convidados:");
                    conjuntoConvidados.exibirConvidados();
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
            }
        }
    }
}
