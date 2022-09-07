package com.training.java.lab1;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {

    protected final List<CalcOpHolder> calculateOperations = new ArrayList<>();
    private String                     name                = "Hesap Makinesi";

    public Calculator() {
        super();
    }


    public void showMenu() {
        int index = 1;
        for (CalcOpHolder calcOpHolderLoc : this.calculateOperations) {
            System.out.println(index
                               + "-"
                               + calcOpHolderLoc.getShortDesc()
                                                .get());
            index++;
        }
    }

    public void executeOperation(final int index,
                                 final double dParam1,
                                 final double dParam2) {
        if (index > this.calculateOperations.size()) {
            System.out.println("Index doğru değil!");
            return;
        }
        CalcOpHolder calcOpHolderLoc = this.calculateOperations.get(index - 1);
        double calculateLoc = calcOpHolderLoc.getCalculateOperation()
                                             .calculate(dParam1,
                                                        dParam2);
        System.out.println(calcOpHolderLoc.getShortDesc()
                                          .get()
                           + " işleminin sonucu : "
                           + calculateLoc);

    }


    public String getName() {
        return this.name;
    }


    public void setName(final String nameParam) {
        this.name = nameParam;
    }

}
