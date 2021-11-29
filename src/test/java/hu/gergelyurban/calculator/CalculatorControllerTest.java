package hu.gergelyurban.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorControllerTest {

    private CalculatorController calculatorController = new CalculatorController(new Calculator());

    @Test
    public void testSum() {
        Assertions.assertEquals("5", calculatorController.sum(2, 3));
    }

    @Test
    public void divisionTest() {
        Assertions.assertEquals("3", calculatorController.divide(12, 4));
    }

}
