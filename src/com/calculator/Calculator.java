package com.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

    private static final BigDecimal yearInMinute = new BigDecimal(365 * 24 * 60);

    /**
     *
     * @param availablePercentage percentage of availability
     * @return availability in minute in one year
     */
    public static BigDecimal availabilityInMinute(BigDecimal availablePercentage) {
        return availablePercentage.multiply(yearInMinute).divide(new BigDecimal(100));
    }


    /**
     *
     * @param availablePercentage percentage of availability
     * @return unavailability in minute in one year
     */
    public static BigDecimal downTimeInMinute(BigDecimal availablePercentage) {
        return yearInMinute.subtract(availablePercentage.multiply(yearInMinute).divide(new BigDecimal(100)));
    }

    /**
     *
     * @param downTimeInMinute downtime in minute in one year
     * @return availability percentage in one year
     */
    //this is an optional method, computing the availability by receiving available minutes in a year, as it input
    public static BigDecimal availabilityPercentage(BigDecimal downTimeInMinute) {
        return new BigDecimal("100").subtract(downTimeInMinute.divide(yearInMinute, 6,RoundingMode.HALF_UP).multiply(new BigDecimal("100")));
    }

    /**
     *
     * @param availablePercentage availability percentage in one year
     * @return unavailability percentage in one year
     */
    public static BigDecimal percentageComplement(BigDecimal availablePercentage) {
        return new BigDecimal("100").subtract(availablePercentage);
    }

}
