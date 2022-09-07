package com.training.java.java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.training.java.collections.Employee;

public class Stream3 {

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

        Stream<Employee> mapLoc = listLoc.stream()
                                         .skip(1)
                                         .limit(10)
                                         .filter(s -> s.length() >= 4)
                                         .map(s -> new Employee(s,
                                                                s));

        IntSummaryStatistics collectLoc = listLoc.stream()
                                                 .skip(1)
                                                 .limit(10)
                                                 .filter(s -> s.length() >= 4)
                                                 .map(s -> s.length())
                                                 .collect(Collectors.summarizingInt(s -> s));

        IntConsumer summaryStatisticsLoc = listLoc.stream()
                                                  .skip(1)
                                                  .limit(10)
                                                  .filter(s -> s.length() >= 4)
                                                  .mapToInt(s -> s.length())
                                                  .summaryStatistics();
        System.out.println(summaryStatisticsLoc);
    }
}
