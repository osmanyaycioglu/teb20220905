package com.training.java.java8;

import java.util.function.Supplier;

public class SupplierRun {

    public static void main(final String[] args) {
        testAndRun("osman" + 10 + "-" + 20 + "yay",
                   20);

        testAndRun2(() -> "osman" + 10 + "-" + 20 + "yay",
                    20);

    }


    public static void testAndRun(final String str,
                                  final int value) {
        if (value > 10) {
            System.out.println(str);
        }
    }

    public static void testAndRun2(final Supplier<String> str,
                                   final int value) {
        if (value > 10) {
            System.out.println(str.get());
        }
    }

}
