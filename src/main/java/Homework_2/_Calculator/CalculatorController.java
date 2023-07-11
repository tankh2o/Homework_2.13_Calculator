package Homework_2._Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private CalculatorService numberService = new CalculatorService();

    @GetMapping()
    public String greeting() {
        return numberService.greeting();
    }

    @GetMapping(path = "plus")
    public Integer plus(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return Integer.valueOf("Вы забыли написать входное значение.");
        }
        return numberService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public Integer minus(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return Integer.valueOf("Вы забыли написать входное значение.");
        }
        return numberService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public Integer multiply(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return Integer.valueOf("Вы забыли написать входное значение.");
        }
        return numberService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public double divide(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            throw new RuntimeException("Вы забыли написать входное значение.");
        }
        return numberService.divide(num1, num2);
    }
}
