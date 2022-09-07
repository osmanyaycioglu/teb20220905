package com.training.java.lab1;

public class NormalCalculator extends Calculator {


    public NormalCalculator() {
        this.calculateOperations.add(new CalcOpHolder((d1,
                                                       d2) -> d1 + d2,
                                                      () -> "Toplama"));
        this.calculateOperations.add(new CalcOpHolder((d1,
                                                       d2) -> d1 - d2,
                                                      () -> "Cıkarma"));
        this.calculateOperations.add(new CalcOpHolder((d1,
                                                       d2) -> d1 * d2,
                                                      () -> "Çarpma"));
        this.calculateOperations.add(new CalcOpHolder((d1,
                                                       d2) -> d1 / d2,
                                                      () -> "Bölme"));
        this.setName("Normal Hesap Makinesi");
    }

}
