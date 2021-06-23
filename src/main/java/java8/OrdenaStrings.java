package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("Cebola");
        lista.add("Abobora");
        lista.add("Queijo");
        lista.add("Goiabada com queijo");
        lista.add("Chá");

        Collections.sort(lista);
        System.out.println(lista);

        Comparator<String> comparador = new ComparadorPorTamanho();
        Collections.sort(lista, comparador);
        System.out.println(lista);

        // Java 8
        lista.sort(comparador);
        System.out.println(lista);

        lista.sort(null);
        System.out.println(lista);

        Consumer<String> consumidor = new ImprimeNaLinha();
        lista.forEach(consumidor);

        // Lambda
        lista.forEach(s -> System.out.println(s));

        lista.forEach(s -> {
            System.out.print(s);
            System.out.println(s);
        });

        lista.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
        lista.forEach(s -> System.out.println(s));

        lista.sort(Comparator.comparing(s -> s.length()));
        lista.forEach(s -> System.out.println(s));

        lista.sort(Comparator.comparing(String::length));
        lista.forEach(System.out::println);

        lista.sort(String.CASE_INSENSITIVE_ORDER);
        lista.forEach(System.out::println);
    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

    public int compare(String o1, String o2) {
        if (o1.length() < o2.length())
            return -1;
        if (o1.length() > o2.length())
           return 1;
        return 0;
    }
}
