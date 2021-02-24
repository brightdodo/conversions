package com.bright.conversions.controller;

import com.bright.conversions.service.ConversionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/conversions")
public class ConversionsController {
    private final ConversionsService conversionsService;

    @GetMapping("ktoc")
    public BigDecimal kelvinToCelsius(@RequestParam("kelvin") double kelvin) {
        return conversionsService.convertKelvinToCelsius(kelvin);
    }

    @GetMapping("ctok")
    public BigDecimal celsiusToKelvin(@RequestParam("celsius") double celsius) {
        return conversionsService.convertCelsiusToKelvin(celsius);
    }

    @GetMapping("ktom")
    public BigDecimal kilometerToMile(@RequestParam("kilometer") double kilometer) {
        return conversionsService.convertKilometersToMiles(kilometer);
    }

    @GetMapping("mtok")
    public BigDecimal mileToKilometer(@RequestParam("mile") double mile) {
        return conversionsService.convertMilesToKilometers(mile);
    }
}
