package com.example.homework2_12.Service;

import com.example.homework2_12.Exception.DivizionByZeroException;
import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String showGreetings() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(double num1, double num2) {
        double sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String minus(double num1, double num2) {
        double dif = num1 - num2;
        return num1 + " - " + num2 + " = " + dif;
    }

    public String multiply(double num1, double num2) {
        double mult = num1 * num2;
        return num1 + " * " + num2 + " = " + mult;
    }

    public String divide(double num1, double num2) {
        if (num2 == 0) {
            throw new DivizionByZeroException();
        }
        return num1 + " / " + num2 + " = " + num1 / num2;
    }



}
