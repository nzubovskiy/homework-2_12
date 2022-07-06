package Contoller;


import Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreetings() {
        return calculatorService.showGreetings();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam (required = false) float num1, @RequestParam (required = false)  float num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Не передан один из параметров";
        } else {
            return calculatorService.plus(num1, num2);
        }
    }

    @GetMapping("/minus")
    public String minus(@RequestParam (required = false) float num1, @RequestParam (required = false)  float num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Не передан один из параметров";
        } else {
            return calculatorService.minus(num1, num2);
        }
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam (required = false) float num1, @RequestParam (required = false) float num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Не передан один из параметров";
        } else {
            return calculatorService.multiply(num1, num2);
        }
    }

    @GetMapping("/divide")
    public String divide(@RequestParam (required = false) float num1, @RequestParam (required = false) float num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Не передан один из параметров";
        } else {
            return calculatorService.divide(num1, num2);
        }
    }


}
