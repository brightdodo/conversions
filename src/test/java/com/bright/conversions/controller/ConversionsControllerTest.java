package com.bright.conversions.controller;

import com.bright.conversions.service.ConversionsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = ConversionsController.class)
class ConversionsControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    private ConversionsService mockConversionService;

    @Test
    void whenKtoc_return200() throws Exception {
        when(mockConversionService.convertKelvinToCelsius(anyDouble())).thenReturn(BigDecimal.TEN);
        mockMvc.perform(MockMvcRequestBuilders.get("/conversions/ktoc")
                                              .contentType(MediaType.APPLICATION_JSON)
                                              .param("kelvin", "2.0"))
               .andExpect(status().isOk())
               .andReturn();
    }

    @Test
    void givenMissingParam_whenKtoc_return400() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/conversions/ktoc")
                                              .contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isBadRequest())
               .andReturn();
    }

    @Test
    void whenCtok_return200() throws Exception {
        when(mockConversionService.convertCelsiusToKelvin(anyDouble())).thenReturn(BigDecimal.TEN);
        mockMvc.perform(MockMvcRequestBuilders.get("/conversions/ctok")
                                              .contentType(MediaType.APPLICATION_JSON)
                                              .param("celsius", "5.1"))
               .andExpect(status().isOk())
               .andReturn();
    }

    @Test
    void givenMissingParam_whenCtok_return400() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/conversions/ctok")
                                              .contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isBadRequest())
               .andReturn();
    }

    @Test
    void whenMtok_return200() throws Exception {
        when(mockConversionService.convertMilesToKilometers(anyDouble())).thenReturn(BigDecimal.TEN);
        mockMvc.perform(MockMvcRequestBuilders.get("/conversions/mtok")
                                              .contentType(MediaType.APPLICATION_JSON)
                                              .param("mile", "13"))
               .andExpect(status().isOk())
               .andReturn();
    }

    @Test
    void givenMissingParam_whenMtok_return400() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/conversions/mtok")
                                              .contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isBadRequest())
               .andReturn();
    }

    @Test
    void whenKtom_return200() throws Exception {
        when(mockConversionService.convertKilometersToMiles(anyDouble())).thenReturn(BigDecimal.TEN);
        mockMvc.perform(MockMvcRequestBuilders.get("/conversions/ktom")
                                              .contentType(MediaType.APPLICATION_JSON)
                                              .param("kilometer", "3"))
               .andExpect(status().isOk())
               .andReturn();
    }

    @Test
    void givenMissingParam_whenKtom_return400() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/conversions/ktom")
                                              .contentType(MediaType.APPLICATION_JSON))
               .andExpect(status().isBadRequest())
               .andReturn();
    }
}