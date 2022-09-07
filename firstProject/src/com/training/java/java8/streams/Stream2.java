package com.training.java.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {

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

        List<String> collectLoc = listLoc.stream()
                                         .peek(s -> System.out.println("Before Skip : "
                                                                       + s
                                                                       + " Thread : "
                                                                       + Thread.currentThread()
                                                                               .getName()))
                                         .skip(1)
                                         .peek(s -> System.out.println("Before limit : "
                                                                       + s
                                                                       + " Thread : "
                                                                       + Thread.currentThread()
                                                                               .getName()))
                                         .limit(10)
                                         .peek(s -> System.out.println("Before filter : "
                                                                       + s
                                                                       + " Thread : "
                                                                       + Thread.currentThread()
                                                                               .getName()))
                                         .filter(s -> s.length() >= 4)
                                         .peek(s -> System.out.println("Before collect : "
                                                                       + s
                                                                       + " Thread : "
                                                                       + Thread.currentThread()
                                                                               .getName()))
                                         .collect(Collectors.toList());
        System.out.println(collectLoc);
    }
}
