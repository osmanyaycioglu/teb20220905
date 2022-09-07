package com.training.java.java8.streams;

import java.util.Arrays;
import java.util.List;

import com.training.java.collections.Employee;

public class Stream8 {

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


        listLoc.stream()
               .distinct()
               .map(s -> s.split(","))
               .filter(sa -> sa.length == 2)
               .map(sa -> new Employee(sa[0],
                                       sa[1]))
               .flatMap(e -> {
                   char[] charArrayLoc = e.getName()
                                          .toCharArray();
                   Character[] charactersLoc = new Character[charArrayLoc.length];
                   for (int iLoc = 0; iLoc < charArrayLoc.length; iLoc++) {
                       charactersLoc[iLoc] = charArrayLoc[iLoc];
                   }
                   return Arrays.stream(charactersLoc);
               })
               .distinct()
               .sorted()
               .forEach(c -> System.out.println(c));


    }
}
