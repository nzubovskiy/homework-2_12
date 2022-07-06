package Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String showGreetings() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(float num1, float num2) {
        float sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String minus(float num1, float num2) {
        float dif = num1 - num2;
        return num1 + " - " + num2 + " = " + dif;
    }

    public String multiply(float num1, float num2) {
        float mult = num1 * num2;
        return num1 + " * " + num2 + " = " + mult;
    }

    public String divide(float num1, float num2) {
        if (num2 == 0) {
            return "Ошибка! Нельзя делить на ноль!";
        } else {
            return num1 + " / " + num2 + " = " + num1 / num2;
        }
    }

}
