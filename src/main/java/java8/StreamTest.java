package java8;


import modelo.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));
        //cursos.forEach(System.out::println);

//        cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .forEach(System.out::println);

//        cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .map(c -> c.getAlunos())
//                .forEach(total -> System.out.println(total));

//        cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .map(Curso::getAlunos)
//                .forEach(System.out::println);

//        int soma = cursos.stream()
//                .filter(curso -> curso.getAlunos() >= 100)
//                .mapToInt(Curso::getAlunos)
//                .sum();
//        System.out.println("Soma = " + soma);

//        cursos.stream()
//                .map(Curso::getNome)
//                .forEach(System.out::println);

//        Optional<Curso> optionalCurso = cursos.stream()
//                .filter(curso -> curso.getAlunos() >= 1000)
//                .findAny();
//        optionalCurso.ifPresent(System.out::println);
//        Curso nada = optionalCurso.orElse(new Curso("Nada", 0));
//        System.out.println(nada);

//          cursos.stream()
//            .filter(curso -> curso.getAlunos() >= 100)
//            .findAny()
//            .ifPresent(System.out::println);

        cursos = cursos.stream()
                .filter(curso -> curso.getAlunos() < 100)
                .sorted(Comparator.comparing(Curso::getAlunos).reversed())
                .collect(Collectors.toList());

        cursos.forEach(System.out::println);

    }
}
