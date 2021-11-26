package hu.gergelyurban.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        Assertions.assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void divisionTest() {
        Assertions.assertEquals(3, calculator.divide(12, 4));
    }
}
