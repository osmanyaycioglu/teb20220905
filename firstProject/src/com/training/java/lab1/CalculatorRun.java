package com.training.java.lab1;

import java.util.List;
import java.util.Scanner;

public class CalculatorRun {

    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            List<Calculator> generateCalListLoc = CalculatorFactory.generateCalList();
            for (int iLoc = 0; iLoc < generateCalListLoc.size(); iLoc++) {
                Calculator calculatorLoc = generateCalListLoc.get(iLoc);
                System.out.println((iLoc + 1) + "-" + calculatorLoc.getName());
            }
            System.out.println("Seçiminiz : ");
            int nextIntLoc = scannerLoc.nextInt();
            Calculator calculatorLoc = generateCalListLoc.get(nextIntLoc - 1);
            while (true) {
                calculatorLoc.showMenu();
                System.out.println("Seçiminiz : ");
                int opIndexLoc = scannerLoc.nextInt();
                System.out.println("Değişken 1 : ");
                double d1Loc = scannerLoc.nextDouble();
                System.out.println("Değişken 2 : ");
                double d2Loc = scannerLoc.nextDouble();
                calculatorLoc.executeOperation(opIndexLoc,
                                               d1Loc,
                                               d2Loc);
            }

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }

    }
}
