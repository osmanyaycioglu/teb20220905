package com.training.java;


public class Araba {

    public static final int ARABA_MAX_HIZ = 250;
    private int             ortalamaHiz;
    int                     donnusHizi;
    protected int           maxHiz;
    public int              test;


    public void atlaGezi() {
        long l = 100L;
        Long lobjLongLoc = 100L;
        System.out.println("Atla geziyorum");
    }

    public int ileriGit(final int km) {
        return (this.ortalamaHiz * km) / 60;
    }

    protected int don() {
        return this.donnusHizi / 60;
    }


    public int getOrtalamaHiz() {
        return this.ortalamaHiz;
    }


    public void setOrtalamaHiz(final int ortalamaHizParam) {
        this.ortalamaHiz = ortalamaHizParam;
    }


    public int getDonnusHizi() {
        return this.donnusHizi;
    }


    public void setDonnusHizi(final int donnusHiziParam) {
        this.donnusHizi = donnusHiziParam;
    }


    public int getMaxHiz() {
        return this.maxHiz;
    }


    public void setMaxHiz(final int maxHizParam) {
        if (maxHizParam > Araba.ARABA_MAX_HIZ) {
            this.maxHiz = Araba.ARABA_MAX_HIZ;
        } else {
            this.maxHiz = maxHizParam;
        }
    }


}
