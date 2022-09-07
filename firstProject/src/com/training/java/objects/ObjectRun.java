package com.training.java.objects;


public class ObjectRun {

    public static void main(final String[] args) {
        MutableObj mutableObj = new MutableObj();
        mutableObj.setString("osman");

        IMMutableObj imMutableObjLoc = new IMMutableObj("osman");
        String stringLoc = imMutableObjLoc.getString();

        String str = "osman";
        str += " yay";

        String concatLoc = str.concat(" test");
        System.out.println(concatLoc);
    }
}
