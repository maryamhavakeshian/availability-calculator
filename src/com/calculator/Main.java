package com.calculator;

import java.math.BigDecimal;

public class Main {

    // add availability percentage  to e list, it is used as our input list
    static BigDecimal[] percentageList = {
            new BigDecimal("99.99"),
            new BigDecimal("95"),
            new BigDecimal("99.5"),
            new BigDecimal("99.95"),
            new BigDecimal("99.995"),
            new BigDecimal("99.999")
    };

    public static void main(String[] args) {

        //going through this loop and call the methods of calculator class to compute the unavailability percentage, availability time, and unavailability time in minute per year
        for (BigDecimal availablePercentage : percentageList) {
            System.out.println("availability percentage: " + availablePercentage +
                    "%,\n\t\t\t\t -------> unavailability percentage: " + Calculator.percentageComplement(availablePercentage) +
                    "%, \n\t\t\t\t -------> availability time : " + Calculator.availabilityInMinute(availablePercentage) + " min in one year" +
                    ", \n\t\t\t\t -------> unavailable time: " + Calculator.downTimeInMinute(availablePercentage) + " min in one year\n");
        }

    }
}
