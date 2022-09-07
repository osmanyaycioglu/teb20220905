package com.training.java.lab1;

import java.util.ArrayList;
import java.util.List;

public class CalculatorFactory {

    public static List<Calculator> generateCalList() {
        List<Calculator> calculatorsLoc = new ArrayList<>();
        calculatorsLoc.add(new NormalCalculator());
        calculatorsLoc.add(new SinCalculator());
        calculatorsLoc.add(new MathCalculator());
        return calculatorsLoc;
    }

}
