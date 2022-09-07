package com.training.java.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.training.java.collections.Employee;

public class Stream5 {

    public static void main(final String[] args) {
        List<String> listLoc = Arrays.asList("osman,yay",
                                             "ali,al",
                                             "veli,val",
                                             "ayşe,tutar",
                                             "fatma,pelin,xyz",
                                             "mehmet,alaz",
                                             "osman,kutay",
                                             "ali,al",
                                             "veli,kulaç");

        Integer reduceLoc = listLoc.stream()
                                   .distinct()
                                   .map(s -> s.split(","))
                                   .filter(sa -> sa.length == 2)
                                   .map(sa -> new Employee(sa[0],
                                                           sa[1]))
                                   .reduce(0,
                                           (i,
                                            e) -> e.getName()
                                                   .length()
                                                  + i,
                                           (i1,
                                            i2) -> i1 + i2);
        System.out.println("Toplam : " + reduceLoc);
        ArrayList<Employee> reduce2Loc = listLoc.stream()
                                                .distinct()
                                                .map(s -> s.split(","))
                                                .filter(sa -> sa.length == 2)
                                                .map(sa -> new Employee(sa[0],
                                                                        sa[1]))
                                                .reduce(new ArrayList<Employee>(),
                                                        (al,
                                                         e) -> {
                                                            al.add(e);
                                                            return al;
                                                        },
                                                        (al1,
                                                         al2) -> {
                                                            al1.addAll(al2);
                                                            return al2;
                                                        });
        System.out.println(reduce2Loc);

    }
}
