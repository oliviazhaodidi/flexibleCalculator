package com.example.flexiblecalculator.Operations;
import com.example.flexiblecalculator.Operation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

public class OperationFactory {
    private final AdditionOperation additionOperation;
    private final SubtractionOperation subtractionOperation;
    private final MultiplicationOperation multiplicationOperation;
    private final DivisionOperation divisionOperation;

    public OperationFactory(AdditionOperation additionOperation, SubtractionOperation subtractionOperation,
                            MultiplicationOperation multiplicationOperation, DivisionOperation divisionOperation) {
        this.additionOperation = additionOperation;
        this.subtractionOperation = subtractionOperation;
        this.multiplicationOperation = multiplicationOperation;
        this.divisionOperation = divisionOperation;
    }

    @Bean
    public Map<Operation, OperationHandler> operationHandlers() {
        Map<Operation, OperationHandler> operations = new HashMap<>();
        operations.put(Operation.ADD, additionOperation);
        operations.put(Operation.SUBTRACT, subtractionOperation);
        operations.put(Operation.MULTIPLY, multiplicationOperation);
        operations.put(Operation.DIVIDE, divisionOperation);
        return operations;
    }
}
