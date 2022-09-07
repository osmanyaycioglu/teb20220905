package com.training.java.lab1;


public class MathCalculator extends SinCalculator {


    public MathCalculator() {
        this.calculateOperations.add(new CalcOpHolder((d1,
                                                       d2) -> Math.log(d1) + Math.log(d2),
                                                      () -> "Logaritma"));
        this.calculateOperations.add(new CalcOpHolder((d1,
                                                       d2) -> Math.floorDiv((long) d1,
                                                                            (long) d2),
                                                      () -> "Floor"));
        this.setName("Matamatiksel Hesap Makinesi");
    }

}
