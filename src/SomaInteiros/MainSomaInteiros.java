package SomaInteiros;

import PesquisaLivros.CatalogoLivros;

import java.util.Scanner;

public class MainSomaInteiros {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();
        var optionMenu = 1;

        System.out.println("Collections Java");
        System.out.println("Exercício Soma de inteiros");

        while (optionMenu != 0) {
            System.out.println("\nMenu de Soma");
            System.out.println("1. Adicionar números a lista");
            System.out.println("2. Calcular soma");
            System.out.println("3. Maior número da lista");
            System.out.println("4. Menor número da lista");
            System.out.println("5. Listar os números");
            System.out.println("6. Listar os números em ordem ascendente");
            System.out.println("7. Listar os números em ordem descendente");
            System.out.println("0. Sair");
            System.out.println("Opção desejada:");
            optionMenu = scanner.nextInt();

            var number = 0;

            switch (optionMenu){
                case 1:
                    System.out.println("Quantidade de números:");
                    var quantNumbers = scanner.nextInt();

                    for (var i = 1; i <= quantNumbers; i++){
                        System.out.printf("Número %s: ", i);
                        number = scanner.nextInt();
                        somaNumeros.adicionarNumero(number);
                    }
                    break;
                case 2:
                    System.out.println("Resultado da soma: " + somaNumeros.calcularSoma());
                    break;
                case 3:
                    System.out.println("Maior número da lista: " + somaNumeros.encontrarMaiorNumero());
                    break;
                case 4:
                    System.out.println("Menor número da lista: " + somaNumeros.encontrarMenorNumero());
                    break;
                case 5:
                    System.out.println("Números na lista: " + somaNumeros.exibirNumeros());
                    break;
                case 6:
                    System.out.println("Ordenação ascendente: " + somaNumeros.ordenarAscendente());
                    break;
                case 7:
                    System.out.println("Ordenação descendente: " + somaNumeros.ordenarDescendente());
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
            }
        }

    }
}