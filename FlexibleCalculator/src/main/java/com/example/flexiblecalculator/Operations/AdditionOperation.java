package com.example.flexiblecalculator.Operations;
import org.springframework.stereotype.Component;
@Component

public class AdditionOperation implements OperationHandler {
    @Override
    public Number apply(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}
