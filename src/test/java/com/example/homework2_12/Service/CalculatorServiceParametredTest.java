package com.example.homework2_12.Service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static com.example.homework2_12.TestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParametredTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(ZERO, TWO),
                Arguments.of(THREE, ONE),
                Arguments.of(THREE, TWO)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void plus(double num1, double num2) {
        assertEquals(num1 + num2, out.plus(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void minus(double num1, double num2) {
        assertEquals(num1 - num2, out.minus(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void multiply(double num1, double num2) {
        assertEquals(num1 * num2, out.multiply(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void divide(double num1, double num2) {
        assertEquals(num1 / num2, out.divide(num1,num2));
    }

}
