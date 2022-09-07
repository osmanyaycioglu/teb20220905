package com.training.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListRun {

    private static String[] strings = new String[10];

    public static void main(final String[] args) {
        String[] newStrings = new String[20];
        System.arraycopy(ListRun.strings,
                         0,
                         newStrings,
                         0,
                         10);
        ListRun.strings = newStrings;

        List<String> listLoc = new ArrayList<>(1_100_000);
        List<String> listXLoc = new CopyOnWriteArrayList<>();
        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            // listLoc.add("osman" + iLoc);
            listLoc.add("osman" + iLoc);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 999_000; iLoc < 1_000_000; iLoc++) {
            listLoc.contains("osman" + iLoc);
        }
        System.out.println("Contains Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            listLoc.get(iLoc);
        }
        System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10_000; iLoc++) {
            listLoc.remove(0);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));


        //        String stringLoc = listLoc.get(0);
        //        for (int iLoc = 0; iLoc < 100; iLoc++) {
        //            String string2Loc = listLoc.get(iLoc);
        //        }

        //        Iterator<String> iteratorLoc = listLoc.iterator();
        //        while (iteratorLoc.hasNext()) {
        //            String nextLoc = iteratorLoc.next();
        //            System.out.println(nextLoc);
        //        }
        //
        //        for (String string2Loc : listLoc) {
        //            System.out.println(string2Loc);
        //        }
        //
        //        listLoc.forEach(System.out::println);
        //        listLoc.forEach(s -> System.out.println(s));
    }
}
