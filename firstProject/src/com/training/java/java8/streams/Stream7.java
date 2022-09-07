package com.training.java.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.java.collections.Employee;

public class Stream7 {

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

        Map<String, Employee> mapLoc = new HashMap<>();
        List<Employee> employeesLoc = new ArrayList<>();
        listLoc.stream()
               .distinct()
               .map(s -> s.split(","))
               .filter(sa -> sa.length == 2)
               .map(sa -> new Employee(sa[0],
                                       sa[1]))
               .peek(e -> mapLoc.put(e.getName(),
                                     e))
               .peek(e -> employeesLoc.add(e))
               .forEach(e -> System.out.println("Sayın " + e.getName() + " " + e.getSurname()));

        System.out.println(employeesLoc);
        System.out.println(mapLoc);
    }
}
