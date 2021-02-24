package com.bright.conversions.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = ConversionsService.class)
class ConversionsServiceTest {
    @Autowired
    private ConversionsService conversionsService;

    @Test
    void ktoc_success() {
        var expectedCelsius = BigDecimal.valueOf(-253.15);
        var actualCelsius = conversionsService.convertKelvinToCelsius(20.00);
        assertEquals(expectedCelsius, actualCelsius);
    }

    @Test
    void ctok_success() {
        var expectedKelvins = BigDecimal.valueOf(293.15);
        var actualKelvins = conversionsService.convertCelsiusToKelvin(20.00);
        assertEquals(expectedKelvins, actualKelvins);
    }

    @Test
    void mtok_success() {
        var expectedKms = BigDecimal.valueOf(24.1401);
        var actualKms = conversionsService.convertMilesToKilometers(15.00);
        assertEquals(expectedKms, actualKms);
    }

    @Test
    void ktom_success() {
        var expectedMiles = BigDecimal.valueOf(9.3206);
        var actualKms = conversionsService.convertKilometersToMiles(15.00);
        assertEquals(expectedMiles, actualKms);
    }
}