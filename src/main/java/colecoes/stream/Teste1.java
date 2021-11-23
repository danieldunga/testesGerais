package colecoes.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste1 {
    public static void main(String[] args) {

        List<Integer> listaInicial = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        List<Integer> listaExclusao = Arrays.asList(6,7,8,9,10);
        List<Integer> newList = listaInicial.stream()
                .map(i -> i + 2)
                .filter(i -> i % 2== 0)
                .filter(i -> !listaExclusao.contains(i))
//                .reduce(i -> i + 2)
                .collect(Collectors.toList());

        System.out.println("umADez: " + newList);

        long count = listaInicial.stream()
                .map(i -> i + 2)
                .filter(i -> i % 2 == 0)
                .filter(i -> !listaExclusao.contains(i))
                .count();
        System.out.println("count: " + count);

        // Soma de todos os elementos da lista
        Integer soma = listaInicial
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println("soma: " + soma);

        soma = listaInicial
                .stream()
                .filter(i -> i < -5)
                .reduce(123, Integer::sum);
        System.out.println("soma: " + soma);

        // Reduce com String

        List<String> palavras = Arrays.asList("Abobora", "Salada", "Sardinha");
        String resultado = palavras.stream()
                .reduce("", (parcial, str) -> parcial + " " + str);
        System.out.println("Teste com String:" + resultado);
    }
}
