package com.example.flexiblecalculator.Service;
import com.example.flexiblecalculator.Operations.OperationHandler;
import org.springframework.stereotype.Service;
import com.example.flexiblecalculator.Operation;

import java.util.List;
import java.util.Map;
@Service
public class CalculatorService {
    private final Map<Operation, OperationHandler> operationHandlers;

    public CalculatorService(Map<Operation, OperationHandler> operationHandlers) {
        this.operationHandlers = operationHandlers;
    }

    public Number calculate(Operation op, Number num1, Number num2) {
        OperationHandler handler = operationHandlers.get(op);
        if (handler == null) {
            throw new UnsupportedOperationException("Operation " + op + " is not supported.");
        }
        return handler.apply(num1, num2);
    }

    public Number chainCalculate(Number initialValue, List<Operation> operations, List<Number> operands) {
        Number result = initialValue;
        for (int i = 0; i < operations.size(); i++) {
            result = calculate(operations.get(i), result, operands.get(i));
        }
        return result;
    }
}
