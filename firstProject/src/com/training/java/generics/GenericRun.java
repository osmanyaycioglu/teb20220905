package com.training.java.generics;

import com.training.java.intf.GreetArabic;
import com.training.java.intf.GreetTr;

public class GenericRun {

    public static void main(final String[] args) {
        IntegerHolder holderLoc = new IntegerHolder();
        holderLoc.setValue(100);
        Integer intVal = holderLoc.getValue();

        ObjectHolder holder = new ObjectHolder();
        holder.setValue("osman");
        holder.setValue(100);
        holder.setValue(382792783L);
        holder.setValue(1981073.3D);
        Object valueLoc = holder.getValue();

        // String stringLoc = (String) valueLoc;
        if (valueLoc instanceof String) {
            String stringLoc2 = (String) valueLoc;
        } else if (valueLoc instanceof Double) {
            Double doubleLoc = (Double) valueLoc;
        }

        GenericHolder<Long> holder2 = new GenericHolder<>();
        holder2.setValue(100L);
        Long value2Loc = holder2.getValue();

        GenericTwoHolder<String, Double> twoHolderLoc = new GenericTwoHolder<>();
        twoHolderLoc.setValue("try");
        twoHolderLoc.setSecondvalue(10.5D);

        String generateStringLoc = generateString(100L);

        GenericHolder2<GreetArabic> holder22 = new GenericHolder2<>(new GreetArabic());
        holder22.getString("osman");
        GenericHolder2<GreetTr> holder23 = new GenericHolder2<>(new GreetTr());
        holder23.getString("osman");

    }


    public static <F> String generateString(final F value) {
        return "Value " + value.toString();
    }
}
