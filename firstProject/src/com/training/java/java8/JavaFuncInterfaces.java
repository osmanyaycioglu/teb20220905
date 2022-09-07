package com.training.java.java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.training.java.collections.Employee;

public class JavaFuncInterfaces {

    public static void main(final String[] args) {
        Consumer<String> consumerLoc = s -> System.out.println("Gelen data " + s);
        Consumer<Integer> consumerLoc2 = i -> System.out.println("Minute to milis " + (i * 60 * 60 * 1000));
        BiConsumer<String, Integer> biConsumerLoc = (s,
                                                     i) -> System.out.println("String büyük mü : " + (s.length() > i));
        IntConsumer intConsumerLoc = i -> System.out.println("int : " + i);
        LongConsumer longConsumerLoc = l -> System.out.println("long : " + l);
        DoubleConsumer doubleConsumerLoc;

        Function<String, Integer> functionLoc = s -> Integer.parseInt(s);
        Function<String, Integer> functionLoc2 = s -> s.length();
        BiFunction<String, Integer, Integer> biFunctionLoc = (s,
                                                              i) -> i + Integer.parseInt(s);
        UnaryOperator<String> unaryOperatorLoc = s -> s + " test";
        Function<String, String> unaryOperatorLoc2 = s -> s + " test";
        BinaryOperator<String> binaryOperatorLoc = (s1,
                                                    s2) -> s1 + " " + s2;
        BiFunction<String, String, String> binaryOperatorLoc2 = (s1,
                                                                 s2) -> s1 + " " + s2;


        IntToLongFunction function2Loc;
        IntToDoubleFunction function3Loc;

        Predicate<String> predicateLoc = s -> s.length() > 10;
        Predicate<Integer> predicateLoc2 = i -> i > 10;
        BiPredicate<String, Employee> biPredicateLoc = (s,
                                                        e) -> s.equals(e.getName());
        if (predicateLoc.test("osman")) {

        }

        Supplier<String> supplierLoc = () -> "test supplier";

    }
}
