package com.training.java.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.training.java.collections.Employee;

public class Stream6 {

    public static void main(final String[] args) {
        List<String> listLoc = Arrays.asList("osman1,yay",
                                             "ali,al",
                                             "veli1,val",
                                             "ayşe,tutar",
                                             "fatma,pelin,xyz",
                                             "mehmet,alaz",
                                             "osman,kutay",
                                             "ali,al",
                                             "veli,kulaç");

        boolean allMatchLoc = listLoc.stream()
                                     .distinct()
                                     .map(s -> s.split(","))
                                     .filter(sa -> sa.length == 2)
                                     .map(sa -> new Employee(sa[0],
                                                             sa[1]))
                                     .peek(e -> System.out.println(e))
                                     .allMatch(e -> e.getName()
                                                     .length() > 3);
        System.out.println("All match : " + allMatchLoc);
        boolean anyMatchLoc = listLoc.stream()
                                     .distinct()
                                     .map(s -> s.split(","))
                                     .filter(sa -> sa.length == 2)
                                     .map(sa -> new Employee(sa[0],
                                                             sa[1]))
                                     .peek(e -> System.out.println(e))
                                     .anyMatch(e -> e.getName()
                                                     .length() > 3);
        System.out.println("Any match : " + anyMatchLoc);

        Optional<Employee> findAnyLoc = listLoc.stream()
                                               .distinct()
                                               .map(s -> s.split(","))
                                               .filter(sa -> sa.length == 2)
                                               .map(sa -> new Employee(sa[0],
                                                                       sa[1]))
                                               .peek(e -> System.out.println(e))
                                               .findAny();
        System.out.println("Any match : " + findAnyLoc.orElse(null));


    }
}
