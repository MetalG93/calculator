package hu.gergelyurban.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Contorller for Calculator
 */
@RestController
public class CalculatorController {

    public CalculatorController(Calculator calculator){
        this.calculator = calculator;
    }

    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
    String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return String.valueOf(calculator.sum(a, b));
    }

    @RequestMapping("/divide")
    String divide(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return String.valueOf(calculator.divide(a, b));
    }
}
