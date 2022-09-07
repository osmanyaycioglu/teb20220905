package com.training.java.lab1;

import java.util.function.Supplier;

public class CalcOpHolder {

    private final ICalculateOperation calculateOperation;
    private final Supplier<String>    shortDesc;

    public CalcOpHolder(final ICalculateOperation calculateOperationParam,
                        final Supplier<String> supplierParam) {
        super();
        this.calculateOperation = calculateOperationParam;
        this.shortDesc = supplierParam;
    }

    public ICalculateOperation getCalculateOperation() {
        return this.calculateOperation;
    }


    public Supplier<String> getShortDesc() {
        return this.shortDesc;
    }

}
