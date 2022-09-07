package com.training.java.xyz;

import com.training.java.Araba;

public class BMW extends Araba {

    private String bmwModel;

    public void accessTest() {
        this.maxHiz = 200;
        this.don();
    }

    @Override
    public void atlaGezi() {
        System.out.println("BMW atla gezemez");
        super.atlaGezi();
    }

    public String getBmwModel() {
        return this.bmwModel;
    }

    public void setBmwModel(final String bmwModelParam) {
        this.bmwModel = bmwModelParam;
    }

}
