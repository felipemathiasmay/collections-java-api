package Lists.SomaInteiros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    private final List<Integer> intNumbers;

    public SomaNumeros() {
        this.intNumbers = new ArrayList<>();
    }

    //Adiciona um número à lista de números.
    public void adicionarNumero(int numero){
        intNumbers.add(numero);
    }

    //Calcula a soma de todos os números na lista e retorna o resultado.
    public int calcularSoma(){
        int sumTotal = 0;

        if(!intNumbers.isEmpty()) {
            for (Integer number : intNumbers) {
                sumTotal += number;
            }
            return sumTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    //Encontra o maior número na lista e retorna o valor.
    public int encontrarMaiorNumero(){
        int highNumber = Integer.MIN_VALUE;

        if(!intNumbers.isEmpty()) {
            for (Integer number : intNumbers) {
                if(number >= highNumber){
                    highNumber = number;
                }
            }
            return highNumber;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Encontra o menor número na lista e retorna o valor.
    public int encontrarMenorNumero(){
        int lowNumber = Integer.MAX_VALUE;

        if(!intNumbers.isEmpty()) {
            for (Integer number : intNumbers) {
                if(number <= lowNumber){
                    lowNumber = number;
                }
            }
            return lowNumber;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    //Retorna uma lista contendo todos os números presentes na lista.
    public List<Integer> exibirNumeros(){
        if (!intNumbers.isEmpty()) {
            return this.intNumbers;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
    public List<Integer> ordenarAscendente(){
        List<Integer> ascendingOrder = new ArrayList<>(this.intNumbers);

        if (!intNumbers.isEmpty()) {
            Collections.sort(ascendingOrder);
            return ascendingOrder;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    // Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
    public List<Integer> ordenarDescendente(){
        List<Integer> descendingOrder = new ArrayList<>(this.intNumbers);

        if (!intNumbers.isEmpty()) {
            descendingOrder.sort(Collections.reverseOrder());
            return descendingOrder;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }


}
