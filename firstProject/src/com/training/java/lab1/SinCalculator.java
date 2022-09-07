package com.training.java.lab1;


public class SinCalculator extends NormalCalculator {


    public SinCalculator() {
        this.calculateOperations.add(new CalcOpHolder((d1,
                                                       d2) -> Math.min(d1,
                                                                       d2),
                                                      () -> "Küçük"));
        this.calculateOperations.add(new CalcOpHolder((d1,
                                                       d2) -> Math.max(d1,
                                                                       d2),
                                                      () -> "Büyük"));
        this.setName("Bilimsel Hesap Makinesi");
    }

}
