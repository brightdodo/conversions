package com.bright.conversions.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class ConversionsService {
    private static final BigDecimal KELVINS = BigDecimal.valueOf(273.15);
    private static final BigDecimal MILES = BigDecimal.valueOf(1.60934);

    public BigDecimal convertKelvinToCelsius(double kelvins) {
        return BigDecimal.valueOf(kelvins).subtract(KELVINS);
    }

    public BigDecimal convertCelsiusToKelvin(double celsius) {
        return BigDecimal.valueOf(celsius).add(KELVINS);
    }

    public BigDecimal convertMilesToKilometers(double miles) {
        //get kilometers rounded to 4 decimal places
        return BigDecimal.valueOf(miles).multiply(MILES).setScale(4, RoundingMode.CEILING);
    }

    public BigDecimal convertKilometersToMiles(double kilometers) {
        //Get miles rounded to 4 decimal places
        return BigDecimal.valueOf(kilometers).divide(MILES, 4, RoundingMode.CEILING);
    }
}
