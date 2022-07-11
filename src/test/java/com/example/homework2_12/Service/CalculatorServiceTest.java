package com.example.homework2_12.Service;

import com.example.homework2_12.Exception.DivizionByZeroException;
import org.junit.jupiter.api.Test;

import static com.example.homework2_12.TestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculatorServiceTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void plus() {
        assertEquals(THREE, ONE + TWO);
        assertEquals(TWO, ZERO + TWO);
    }

    @Test
    public void minus() {
        assertEquals(ZERO, TWO - TWO);
        assertEquals(ONE, THREE - TWO);
    }

    @Test
    public void multiply() {
        assertEquals(THREE, ONE * THREE);
        assertEquals(ZERO, TWO * ZERO);
    }

    @Test
    public void divide() {
        assertEquals(ONE, THREE / THREE);
        assertEquals(ZERO, ZERO / ONE);
    }
    @Test
    public void divideByZero() {
        assertThrows(DivizionByZeroException.class, () -> out.divide(TWO, ZERO));

    }


}