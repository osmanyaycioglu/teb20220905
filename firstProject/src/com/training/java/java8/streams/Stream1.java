package com.training.java.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream1 {

    public static void main(final String[] args) {
        List<String> listLoc = Arrays.asList("osman",
                                             "ali",
                                             "veli",
                                             "ayşe",
                                             "fatma",
                                             "mehmet",
                                             "osman",
                                             "ali",
                                             "veli");
        List<String> result = new ArrayList<>();
        Set<String> setLoc = new HashSet<>();
        setLoc.addAll(listLoc);
        for (String stringLoc : setLoc) {
            if (stringLoc.length() >= 4) {
                result.add(stringLoc);
            }
        }
        Collections.sort(result);
        System.out.println(result);

        List<String> collectLoc = listLoc.stream()
                                         .distinct()
                                         .sorted()
                                         .filter(s -> s.length() >= 4)
                                         .collect(Collectors.toList());

        System.out.println(collectLoc);
    }
}
