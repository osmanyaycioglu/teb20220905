package com.training.java.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.training.java.collections.Employee;

public class Stream4 {

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

        List<Employee> collectLoc = listLoc.stream()
                                           .distinct()
                                           .map(s -> s.split(","))
                                           .filter(sa -> sa.length == 2)
                                           .map(sa -> new Employee(sa[0],
                                                                   sa[1]))
                                           .collect(Collectors.toList());
        System.out.println(collectLoc);

        Map<String, Employee> collect2Loc = listLoc.stream()
                                                   .distinct()
                                                   .map(s -> s.split(","))
                                                   .filter(sa -> sa.length == 2)
                                                   .map(sa -> new Employee(sa[0],
                                                                           sa[1]))
                                                   .collect(Collectors.toMap(e -> e.getName(),
                                                                             e -> e));
        System.out.println(collect2Loc);

        String collect3Loc = listLoc.stream()
                                    .distinct()
                                    .collect(Collectors.joining(","));
        System.out.println(collect3Loc);
    }
}
