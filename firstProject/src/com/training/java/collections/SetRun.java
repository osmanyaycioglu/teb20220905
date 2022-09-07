package com.training.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetRun {

    public static void main(final String[] args) {
        Set<String> testSetLoc = new HashSet<>();
        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            // listLoc.add("osman" + iLoc);
            testSetLoc.add("osman" + iLoc);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 999_000; iLoc < 1_000_000; iLoc++) {
            testSetLoc.contains("osman" + iLoc);
        }
        System.out.println("Contains Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10_000; iLoc++) {
            testSetLoc.remove("osman" + iLoc);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));


        Set<String> setLoc = new HashSet<>();
        setLoc.add("1");
        setLoc.add("2");
        setLoc.add("3");
        setLoc.add("4");
        setLoc.add("5");
        setLoc.add("6");
        setLoc.add("7");
        setLoc.add("8");
        setLoc.add("9");
        setLoc.add("10");

        Set<String> setLoc2 = new HashSet<>();
        setLoc2.add("10");
        setLoc2.add("12");
        setLoc2.add("13");
        setLoc2.add("14");
        setLoc2.add("15");
        setLoc2.add("16");
        setLoc2.add("17");
        setLoc2.add("18");
        setLoc2.add("19");
        setLoc2.add("9");
        setLoc2.add("8");

        // setLoc.addAll(setLoc2); // Birleşimini verir
        // setLoc.retainAll(setLoc2); // Kesişim
        // setLoc.removeAll(setLoc2); // fark


        for (String stringLoc : setLoc) {
            System.out.println(stringLoc);
        }

        //        Set<Employee> setLoc2 = new HashSet<>();
        //        setLoc2.add(new Employee("osman",
        //                                 "yay"));
        //        setLoc2.add(new Employee("osman",
        //                                 "yay"));
        //        for (Employee employeeLoc : setLoc2) {
        //            System.out.println("str " + employeeLoc);
        //        }
    }
}
