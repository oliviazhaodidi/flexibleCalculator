package com.example.flexiblecalculator.Operations;
import org.springframework.stereotype.Component;
@Component

public class MultiplicationOperation implements OperationHandler {
    @Override
    public class MultiplicationOperation implements OperationHandler {
        @Override
        public Number apply(Number num1, Number num2) {
            return num1.doubleValue() * num2.doubleValue();
        }
}
