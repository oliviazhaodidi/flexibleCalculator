package com.example.flexiblecalculator.Operations;
import org.springframework.stereotype.Component;
@Component

public class SubtractionOperation implements OperationHandler {
    @Override
    public Number apply(Number num1, Number num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}
