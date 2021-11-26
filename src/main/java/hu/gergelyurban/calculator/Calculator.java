package hu.gergelyurban.calculator;

import org.springframework.stereotype.Service;

/**
 * A basic Calculator
 */
@Service
public class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

}
