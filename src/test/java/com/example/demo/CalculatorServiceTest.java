package com.example.demo;

import com.example.demo.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    void testAdd() {
        int result = calculatorService.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testAddThrowsIAEIfBEqualsToZero() {
        assertThrows(IllegalArgumentException.class,() -> calculatorService.add(1, 0), "Expected IAE if b == 0");
    }

    @Test
    void testSubtract() {
        int result = calculatorService.subtract(3, 2);
        assertEquals(1, result);
    }

    @Test
    void testMultiply() {
        int result = calculatorService.multiply(3, 2);
        assertEquals(6, result);
    }

}
